alert('Bienvenido al sistema de alarma de Breaks de Desafio Latam.')
alert('Para programar una alarma fije la fecha y hora en el calendario y pulse "Crear Alarma"')


/*Definimos las variables y elemento a modificar del documento.*/

const display = document.getElementById('clock');
const audio = new Audio('https://assets.mixkit.co/sfx/preview/mixkit-alarm-digital-clock-beep-989.mp3');
audio.loop = true;
let alarmTime = null;
let alarmTimeout = null;


//Funcion para capturar la hora del sistema.
function ActualizarHora() {
    const date = new Date();

    const hour = formatTime(date.getHours());
    const minutes = formatTime(date.getMinutes());
    const seconds = formatTime(date.getSeconds());



    display.innerText=`${hour} : ${minutes} : ${seconds}`
}

//Funcion para darle formato a la hora.
function formatTime(time) {
    if ( time < 10 ) {
        return '0' + time;
    }
    return time;
}


//Funcion para establecer una hora a la alarma
function setAlarmTime(value) {
    alarmTime = value;
}

//Funcion para fijar una alarma con la hora obtenida anteriormente
function setAlarm() {
    if(alarmTime) {
        const current = new Date();
        const timeToAlarm = new Date(alarmTime);

        if (timeToAlarm > current) {
            const timeout = timeToAlarm.getTime() - current.getTime();
            alarmTimeout = setTimeout(() => audio.play(), timeout);
            alert('Alarma Creada con Exito');
            alert('Para poner fin al sonido de la alarma favor pulsar boton "Borrar Alarma"')
        }
    }
}

//Funcion para eliminar la alarma fijada
function clearAlarm() {
    audio.pause();
    if (alarmTimeout) {
        clearTimeout(alarmTimeout);
        alert('Alarma Eliminada');
    }
}

setInterval(ActualizarHora, 1000);