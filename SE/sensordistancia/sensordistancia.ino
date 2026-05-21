// C++ code
//

int trig =2;

int echo = 3;

int led = 8;





void setup()
{
  Serial.begin(9600);
  pinMode(trig, OUTPUT);
  pinMode(echo, INPUT);
  pinMode (led,OUTPUT);
  
}

void loop()
{
  digitalWrite(trig, LOW);
  delayMicroseconds(2);
  digitalWrite(trig, HIGH);
  delayMicroseconds(10);
  digitalWrite(trig, LOW);
  
  int duracao = pulseIn(echo, HIGH);
  int distancia = (duracao / 2) / 29.1;
  
  Serial.println(distancia);
  
  if (distancia >= 50 and distancia <=60)
    digitalWrite(led, HIGH);
  else
    digitalWrite(led, LOW);
  delay(100);
  
  
  

  
  
  
  
  
  
  
}