



function init(){
    //bigger orbit
    var c = document.getElementById("canva");
    var ctx = c.getContext("2d");

    //Extra terrestrial objects images
    var sun = new Image();
    var earth = new Image();
    var moon = new Image();
    sun.src='https://consciouscalendars.com/wp-content/uploads/2017/09/3D-sun.jpg';
    earth.src = 'http://dreamicus.com/data/earth/earth-01.jpg';
    moon.src = 'https://10minuteastronomy.files.wordpress.com/2012/08/full-moon-aug-1-2012.jpg';
    
    ctx.save();
    ctx.translate(150,150);

    var time= new Date();

    ctx.rotate(((2 * Math.PI) / 60) * time.getSeconds() + ((2 * Math.PI) / 60000) * time.getMilliseconds());
    ctx.translate(90, 0); //radius of circle for earth movement
    ctx.drawImage(earth, -12, -12);
  
    ctx.restore();

    ctx.arc(150, 150, 90, 0, Math.PI * 2, false); // Earth orbit
    ctx.stroke();
 
 
     window.requestAnimationFrame(draw);

    
}


