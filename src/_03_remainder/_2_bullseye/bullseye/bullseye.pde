
void setup() {
 
  // set the size of your sketch
  size(600,600); 
}

void draw() {
  if(mousePressed){
          println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
      }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i=300; i>0; i-=31) {
    if(i%2==0) {
    fill(229,30,150);
  }
else {
  fill(247,40,40);
}
    ellipse(306,291,i,i);
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
}
