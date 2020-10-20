# Chapter 03. 연산자 

## 목차 

[3.1 연산자와 연산식](#연산자와-연산식) 
 
[3.2 연산의 방향과 우선순위](#연산의-방향과-우선순위) 
 
[3.3 단항 연산자](#단항-연산자) 
- [3.3.1 부호 연산자(+,-)](#부호-연산자) 
- [3.3.2 증감 연산자(++,--)](#332-증감-연산자--) 
## 연산자와 연산식

- 연산(operations) : 데이터를 처리하여 결과를 산출하는것 
- 연산자(operator) : 연산에 사용되는 표시나 기호 ex) /,*,+,-
- 피연산자(operand) : 연산되는 데이터 ex) x,y,z
- 연산식(expressions) : 연산자와 피연산자를 이용하여 연산의 과정을 기술한 것 ex) x + y  

        x = 2;
        y = 3;
        z = x + y; 

- 단항 연산자 ex) ++x;
- 이항 연산자 ex) x+y;
- 삼항 연산자 ex) (sum<90) ? x : y;
- 연산식이 피연산자 자리에 올수 있다 ex) int result = (x+y) < 5;

## 연산의 방향과 우선순위

|연산자|연산방향|우선순위|
|------|------|------|
|증감(++,--),부호(+,-),비트(~),논리(!)|<--|1|
|산술(*,/,%)|-->|2|
|산술(+,-)|-->|3|
|쉬프트(<<,>>,>>>)|-->|4|
|비교(<,>,<=,>=, instanceof)|-->|5|
|비교(==,!=)|-->|6|
|논리(&)|-->|7|
|논리(^)|-->|8|
|논리( ㅣ)|-->|9|
|논리(&&)|-->|10|
|논리(ㅣㅣ)|-->|11|
|조건(?:)|-->|12|
|대입(=,+=,-=,*=,/=,%=,^=,ㅣ=,<<=,=>>,>>>+)|-->|13|

        int result = var1 + var2 * var3;

- 위와 같이 *가 먼저 되기 떄문에 var2 * var3가 먼저 연산되는데 반대로 + 먼저 하려면 () 사용하여 아래와 같이 사용하면 된다.
         
        int result = (var1 + var2) * var3;


1. 단항, 이항, 삼항 연산자 순으로 우선순위를 가진다.
2. 산술, 비교, 논리, 대입 연산자 순으로 우선순위를 가진다.
3. 단항과 대입 연산자를 제외한 모든 연산의 방향은 왼쪽에서 오른쪽이다.
4. 복잡한 연산식에는 괄호()를 사용하여 우선순위를 정한다.

## 3.3 단항 연산자

 - 피연산자가 하나인 연산자를 말한다.

### 3.3.1 부호 연산자(+,-)

- 양수나 음수를 표시하며, boolean char 타입을 제외한 나머지 타입에 사용한다.

        int num = +100;
        int num2 = -300;

- 위와 같이 정수나 실수 리터럴에 붙혀 표현한다 또 변수 앞에 붙힐수 있다.

        int num = - 100;
        int result = -num;

- 위와 같이 result에 값은 -(-100)이므로 +100이 된다.

        short s = 100;
        //short result = -s; (에러)
        int result = -s; (정상)

- long 제외 정수 산출시 값이 int가 되므로 주위 해야 한다.


```java

int x = -100;
int result1 = +x; //+(-100)
int result2 = -x;
System.out.println("result1=" + result1);
System.out.println("result2=" + result2);

short s = 100;
//short result3 = -s; //강제 형변환 필요
int result3 = -s; 
System.out.println("result3=" + result3);

result1=-100
result2=100
result3=-100

```

- 연산시 정수는 int가 되어 버리므로 int로 받던지 강제 형변환해야 한다.

### 3.3.2 증감 연산자(++,--)

- 값을 1 증가(++) 1 감소(--)하는 연사자를 말한다.
- boolean 제외 

        ++ 피연산자; // 다른연산 수행전에 1증가
        피연산자 ++; // 다른연산 수행후 1증가

```java

int x = 10;
int y = 10;
int z;

System.out.println("-----------------------");
x++; 11
++x; 12
System.out.println("x=" + x);	12	

System.out.println("-----------------------");		
y--; 9
--y; 8
System.out.println("y=" + y);	8	

System.out.println("-----------------------");		
z = x++; //z에 12대입후 13으로 증가 
System.out.println("z=" + z); 12
System.out.println("x=" + x); 13

System.out.println("-----------------------");		
z = ++x; //14로 증가후 대입 
System.out.println("z=" + z); 14
System.out.println("x=" + x); 14

System.out.println("-----------------------");				
z = ++x + y++; 15 + 8 
System.out.println("z=" + z); 23
System.out.println("x=" + x); 15
System.out.println("y=" + y); 9

-----------------------
x=12
-----------------------
y=8
-----------------------
z=12
x=13
-----------------------
z=14
x=14
-----------------------
z=23
x=15
y=9

```

### 3.3.3 논리 부정 연산자(!)



- boolean만 사용

```java

boolean play = true;
System.out.println(play);

play = !play;
System.out.println(play);

play = !play;
System.out.println(play);

true
false
true


```


### 3.3.4 비트 반전 연산자(~)

- 피연산자를 2진수로 표현햇을때 해당 비트 값을 반전시킨다.
- 이도 연산의 일종으로 int로 변환된다.
- 또 이진값을 반전하면 10이면 -11 -10을 반전하면 9

- 자바에서는 정수 값을 이진 문자열로 리턴하는 Integer.toBinaryString(value); 메소드를 제공
  


```java
public static void main(String[] args) {
        int v1 = 10;
        int v2 = ~v1;
        int v3 = ~v1 + 1;
        System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")");
        System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")");
        System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")");
        System.out.println();
        
        int v4 = -10;
        int v5 = ~v4;
        int v6 = ~v4 + 1;
        System.out.println(toBinaryString(v4) + " (십진수: " + v4 + ")");
        System.out.println(toBinaryString(v5) + " (십진수: " + v5 + ")");
        System.out.println(toBinaryString(v6) + " (십진수: " + v6 + ")");
}

//값이 없는 자리수 까지 확인하려고 만듬 
public static String toBinaryString(int value) {
        String str = Integer.toBinaryString(value);
        while(str.length() < 32) {
                str = "0" + str;
        }
        return str;
}

00000000000000000000000000001010 (십진수: 10)
11111111111111111111111111110101 (십진수: -11)
11111111111111111111111111110110 (십진수: -10)

11111111111111111111111111110110 (십진수: -10)
00000000000000000000000000001001 (십진수: 9)
00000000000000000000000000001010 (십진수: 10)
```

## 3.4 이항 연산자

- 피연산자가 두개인 연산자 

### 3.4.1 산술 연산자(+,-,*,/,%)




```java

```
```java

```
```java

```
```java

```
```java

```
```java

```
```java

```
```java

```