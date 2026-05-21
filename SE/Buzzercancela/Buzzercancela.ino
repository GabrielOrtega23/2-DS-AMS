#include <Servo.h>

Servo meuservo;

int botao = 7;
int led = 10;
int pos = 0;
int led2 = 11;

void setup()
{
  pinMode(botao, INPUT_PULLUP);
  pinMode(led, OUTPUT);
  pinMode(2, OUTPUT);
  pinMode(led2, OUTPUT);
 
  
  meuservo.attach(9);
  meuservo.write(0);
}

void loop()
{
  
  if (digitalRead(botao) == LOW)
  {
    noTone(2);
    for (int angulo = 0; angulo <= 90; angulo++)
    {
      meuservo.write(angulo);
      delay(10);
     
      
    }

      tone(2, 600, 600);
    digitalWrite(led2, HIGH);
    delay(700);
    digitalWrite(led2, LOW);
    
    delay(900);

  
    for (int angulo = 90; angulo >= 0; angulo--)
    {
      meuservo.write(angulo);
       delay(10);

      
    
    }
     tone(2, 600, 600);
      digitalWrite(led2, LOW);
       digitalWrite(led, HIGH);
    delay(700);
     digitalWrite(led, LOW);
    delay(900);
    
      
  }
}