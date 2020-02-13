



function init(){
    //bigger orbit
    var c = document.getElementById("canva");
    var ctx = c.getContext("2d");
    ctx.beginPath();
    ctx.arc(1000, 1000, 200, 0, 2 * Math.PI);
    ctx.stroke();

    //Extra terrestrial objects images
    var sun = new Image();
    var earth = new Image();
    var moon = new Image();
    
    sun.src='https://consciouscalendars.com/wp-content/uploads/2017/09/3D-sun.jpg';
    earth.src = 'http://dreamicus.com/data/earth/earth-01.jpg';
    moon.src = 'https://10minuteastronomy.files.wordpress.com/2012/08/full-moon-aug-1-2012.jpg';

    var TO_RADIANS = Math.PI/180;
 
    var img = new Image();
    img.src = 'http://cssdeck.com/uploads/media/4/4M29duK.png';
    
    ctx.rotate(30 * TO_RADIANS);
    ctx.drawImage(img, 10, 10);
    
    // ctx.drawImage(sun, 200,200,75,75);
    // ctx.drawImage(earth,100,100, 50,50);
    // //ctx.drawImage(moon,0,0,25,25);

    // //rotating the image
    // ctx.translate(10,10);
    // ctx.rotate(30 * TO_RADIANS);
    // ctx.drawImage(earth, 0, 0);

    // ctx.save();
    
    // ctx.restore();
}


