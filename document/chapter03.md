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

- boolean 제외

- 나머지 연산자 %
        
        int result = num % 3;

- 나머지 연산자를 사용하면 정수 리터럴에 따라 0,1,2 하나가 result이 된다.

- 정리 
  
1. 정수 피연산자가 int보다 작을 경우, int로 산출된다.
2. 정수 피연산자가 long이 있을 경우, long타입으로 산출된다.
3. 실수의 경우, 크기가 큰 타입에 따라 산출 된다.

        int int1 = 10;
        int int2 = 2;

        int result1 = int1 + int2; //2
        double result2 = int1 + int2; //2.0
        
        double result3 = (1.0*int1) + int2; //2.5
        double result4 = (double)int1 + int2;  //2.5
        double result5 = int1 + (double)int2;  //2.5

- 실수의 정확한 출력을 위해서는 하나이상의 변수가 실수여야한다. (강제 형변환 포함)


```java
int v1 = 5;
int v2 = 2;

int result1 = v1 + v2;
System.out.println("result1=" + result1);

int result2 = v1 - v2;
System.out.println("result2=" + result2);

int result3 = v1 * v2;
System.out.println("result3=" + result3);

int result4 = v1 / v2;
System.out.println("result4=" + result4);

int result5 = v1 % v2;
System.out.println("result5=" + result5);

double result6 = (double) v1 / v2;
System.out.println("result6=" + result6);	

result1=7
result2=3
result3=10
result4=2
result5=1
result6=2.5

```
```java
char c1 = 'A' + 1;
char c2 = 'A';
//char c3 = c2 + 1;   
System.out.println("c1: " + c1);
System.out.println("c2: " + c2);
//System.out.println("c3: " + c3);
                
c1: B
c2: A
```

- c1은 리터럴간 연산이다 정상적으로 가능하다
- c3의 경우는 다르다 char 타입인 피연산자이므로 연산시 int로 형 변환된다.
- 그러므로 char로 강제 형변환하던지 타입을 int로 변경해야 한다.

        char c3 = (char)c2 + 1;  
        int c3 = c2 + 1;  

#### 오버플로우 탐지

- 산출 값이 타입의 최대치를 넘으면 안된다. 쓰레기값 발생 

```java

//int 의 최대값을 넘었다
int x1 = 1000000;
int y1 = 1000000;
int z1 = x1 * y1;
System.out.println(z1);

//해결
long x = 1000000;
long y = 1000000;
long z = x * y;
System.out.println(z);

-727379968
1000000000000
```

```java

public static void main(String[] args) {
        try {
                int result = safeAdd(2000000000, 2000000000);
                System.out.println(result);
        } catch(ArithmeticException e) {
                System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
        }
}

//6 + 6
//max 10 
//10 - 6 = 4
// 6 6
//-10 -6  10 9 8 7 6 5 > 6
                
public static int safeAdd(int left, int right)  {
        if((right>0)) { 
                //맥스값에서 right를 뺴면 right에 더할수있는최대치가 나오는데 그 값보다 크면 오류
                if(left>(Integer.MAX_VALUE - right)) {
                        throw new ArithmeticException("오버플로우 발생");
                }
        } else {
                if(left<(Integer.MIN_VALUE - right)) {
                        throw new ArithmeticException("오버플로우 발생");
                }
        }
        return left + right;
}
        
```

- 최대치가 넘어 갈것을 대비해서 예외처리를 해야 한다.

#### 정확한 계산은 정수 사용

- 정확한 계산은 실수타입을 사용하지 않는 것이 좋다.

```java
int apple = 1;
double pieceUnit = 0.1;
int number = 7;

double result = apple - number*pieceUnit; // 1- 0.1*7

System.out.println("사과 한개에서 ");
System.out.println("0.7 조각을 빼면, ");
System.out.println(result + " 조각이 남는다.");

사과 한개에서 
0.7 조각을 빼면, 
0.29999999999999993 조각이 남는다.

```
- 실수는 정확한 표현이 어렵고 근사치로 표현하기 떄문에 
- 정수로 변경해서 표현해야 한다.

```java
int apple = 1;

int totalPieces = apple * 10;
int number = 7;
int temp = totalPieces - number;

double result = temp/10.0; 

System.out.println("사과 한개에서 ");
System.out.println("0.7 조각을 빼면, ");
System.out.println(result + " 조각이 남는다.");

사과 한개에서 
0.7 조각을 빼면, 
0.3 조각이 남는다.
```

- 모든 연산을 정수 연산으로 하고 결과부분만 실수로 처리한다.

#### NaN과 Infinity 연산

- / % 를 사용할 경우에도 주의 해야한다.
- 우측에 0이 오면 실행시 에외가 발생한다.
- 즉, 5/0은 무한대(Infinity)값이며
- 5%0은 NaN (Not a Number)
- Double.isInfinite() -> Infinity일 경우 true
- Double.isNaN() -> NaN일 경우 true





```java
int x = 5;
double y = 0.0;

double z = x / y;
//double z = x % y;

System.out.println(Double.isInfinite(z));
System.out.println(Double.isNaN(z));	

//잘못된 코드
System.out.println(z + 2);	

//알맞은 코드
if(Double.isInfinite(z) || Double.isNaN(z)) { 
        System.out.println("값 산출 불가"); 
} else { 
        System.out.println(z + 2); 
}

//---------------------------------------------------

/*int x = 5;
int y = 0;

try {
        //int z = x / y;
        int z = x % y;
        System.out.println("z: " + z);
} catch(ArithmeticException e) {
        System.out.println("0으로 나누면 안됨");
}*/

true
false
Infinity
값 산출 불가

0으로 나누면 안됨
```

-  ArithmeticException 예외처리로 Infinity이거나 NaN일 경우 예외를 반환한다.


#### 입력값의 NaN 검사

- 실수를 입력받을 때는 받드시 NaN 검사를 해야 한다.
- "NaN"를 입력 할수 있다.


```java
String userInput = "NaN";
double val = Double.valueOf( userInput );
System.out.println(val);
double currentBalance = 10000.0;
System.out.println(currentBalance);
currentBalance += val;
System.out.println(currentBalance);

NaN
10000.0
NaN

```

- 그러므로 문자열 입력시에 NaN를 확인해서 예외처리해야 한다.

```java
String userInput = "NaN";
double val = Double.valueOf(userInput);

double currentBalance = 10000.0;

if(Double.isNaN(val)) {
        System.out.println("NaN이 입력되어 처리할 수 없음 ");
        val = 0.0;
} 

currentBalance += val;
System.out.println(currentBalance);

NaN이 입력되어 처리할 수 없음 
10000.0

```

### 3.4.2 문자열 연결 연산자(+)

- + 연산자는 산술 연산자, 부호 연산자인 동시에 문자열 연결 연산자이다.
        
        //숫자 문자열 혼합의 경우 왼쪽에서 오른쪽으로 연산된다. 
        "JDK" + 3 + 3.0; // 문자열처럼 다 더해진다. JDK33.0 
        3+3.0+"JDK"; // 숫자가 연산된후 더해진다. 6.0JDK

```java
String str1 = "JDK" + 6.0;
String str2 = str1 + " Ư¡";
System.out.println(str2);

String str3 = "JDK" + 3 + 3.0;
String str4 = 3 + 3.0 + "JDK";
System.out.println(str3);
System.out.println(str4);	

JDK6.0 Ư¡
JDK33.0
6.0JDK
```

### 3.4.3 비교 연산자(<,<=,>,>=,==,!=)



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
```java

```
