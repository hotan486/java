# 변수와 타입 

## 목차 

[2.3.1 자동 타입 변환](#2.3.3-연산식에서의-자동-타입-변환) 
 
[03 연산자](#연산자) 
 
[03 조건문과 반복문](#조건문과-반복문) 



## 2.1 변수

### 2.1.1 변수
   
    변수란, 하나의 값을 저장할 수 있는 메모리 공간이다.

### 2.1.2 변수의 선언 

    int age; // 정수(int)값을 저장할 수 있는 qge 변수 선언
 
- 변수 명명 규칙 

|작성규칙|
|------|
|첫 글자는 문자나 '$','_'|
|대소문자 구별|
|첫문자는 소문자,중간에 다른 단어가 붙으면 대문자|
|문자의 길이 제한 없고 자바 에약어 금지|


- 예약어는 책 31쪽 참조 

### 2.1.3 변수의 사용 

- 변수값 저장 

        int score;  // 변수 선언
        score = 90; // 값 저장
        int score = 90; // 선언과 동시값 저장 이때 값을 리터털 
        literal 초기의 입력 값 
        constant(상수) 고정값   


    - 정수 리터럴 

        - 소수점 없은 정수는 10진수
        - 0으로 시작 8진수
        - 0x나 abcdef 로 구성 되면 16진수
    - 실수 리터럴 
        - 기본 10진수 eE는 10진수 지수과 가수로 간주 
    - 문자 리터럴 
  
        - '' 묶은 텍스트 

    - 문자열 리터럴 
        - "" 묶은 텍스트 

-  변수값 읽기
    <br/>
      
    ```java

    	int value = 10;    
		int result = value + 10;
		
		System.out.println(result);

        20

    ```

### 2.1.4 변수의 사용 범위

        변수는 선언된 블럭 내에서 사용가능하다 

    
```java

    int v1 = 15;
    if(v1>10) {
        int v2;
        v2 = v1 - 10;
    }
    //int v3 = v1 + v2 + 5;  
    //v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김

```

## 2.2 데이터 타입

### 2.2.1 기본(원시: primitive)타입

|값의 종류|기본타입|메모리사용크기||저장되는 값의 범위|
|:---|---:|:---:|:---:|:---|
|정수|byte|1byte|8bit|-128 ~ 127 |
|정수|char|2byte|16bit|0 ~ 65,535|
|정수|short|4byte|16bit|-32,768~32,767|
|정수|int|4byte|32bit|-2,147,483,648 ~ 2,147,483,647|
|정수|long|8byte|64bit|-2^63 ~ (2^63) - 1|
|실수|float|4byte|32bit||
|실수|double|8byte|64bit||
|논리|boolean|1byte|8bit||

### 2.2.2 정수 타입

- byte 타입 
  
        -128 ~ 127 (양의 정수에 0이 포함)
        음의 이진수를 십진수로 변환시에 보수를 더하여 구한다.


```java

    byte var1 = -128;
    byte var2 = -30;
    byte var3 = 0;
    byte var4 = 30;
    byte var5 = 127; // 127의 다음은 -128
    //byte var6 = 128; //컴파일 에러
    
    System.out.println(var1);
    System.out.println(var2);
    System.out.println(var3);
    System.out.println(var4);
    System.out.println(var5);

    -128
    -30
    0
    30
    127


```


       연산시에 값이 초과해 버리면 -128로 초기화되고
       이러한 엉터리 값을 쓰레기 값이라 한다.


```java

    byte var1 = 125;
    int var2 = 125;
    for(int i=0; i<5; i++) {
        var1++;
        var2++;
        System.out.println("var1: " + var1 + "\t" + "var2: " + var2);

    var1: 126	var2: 126
    var1: 127	var2: 127
    var1: -128	var2: 128
    var1: -127	var2: 129
    var1: -126	var2: 130

```

- char 타입

        유니코드 0 ~ 65535 2byte
        이중 0 ~127 아스키코드 
        44032 ~ 55203 한글 11172자가 할당

http://www.unicode.org

```java

    char c1 = 'A';          	//문자를 직접 저장
    char c2 = 65;          	//십진수로 저장
    char c3 = '\u0041';    //16진수로 저장
    
    char c4 = '가';         	//문자를 직접 저장
    char c5 = 44032;      	//십진수로 저장
    char c6 = '\uac00';    //16진수로 저장
    
    int uniCode = c1;		//유니코드 얻기
    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(uniCode);

    A
    A
    A
    가
    가
    가
    65

```

- int 타입
  
        정수 연산의 기초인 int로 연산을 한다. 


```java
	    int var1 = 10;		//10진수로 저장
		int var2 = 012;		//8진수로 저장
		int var3 = 0xA;		//16진수로 저장
		
		System.out.println(var1);
		System.out.println(var2);
        System.out.println(var3);

        10
        10
        10
```

- long 타입 

```java
		long var1 = 10;		
		long var2 = 20L;		
		//long var3 = 1000000000000;     //컴파일 에러
		long var4 = 1000000000000L; // L
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

        10
        20
        1000000000000
```

### 2.2.3 실수 타입 

        실수 리터럴 기본 타입이 double 이므로 
        float 저장시 f를 붙인다.


```java
		//실수값 저장
		double var1 = 3.14;		
		//float var2 = 3.14;		//컴파일 에러(Type mismatch)
		float var3 = 3.14F;
		
		//정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기
		int var6 = 3000000;
		double var7 = 3e6; // 0이 6개
		float var8 = 3e6F; 
		double var9 = 2e-3; // 0.002
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);

        var1: 3.14
        var2: 3.14
        var4: 0.12345678901234568
        var5: 0.12345679
        var6: 3000000
        var7: 3000000.0
        var8: 3000000.0
        var9: 0.002
```

### 2.2.4 논리 타입

```java
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
        }
        
        중지합니다.
```

## 2.3 타입 변환

### 2.3.1 자동 타입 변환 

        큰 변수에 작은 변수 타입을 저장시 발생 

```java
    byte byteValue = 10;
    int intValue = byteValue;
    System.out.println(intValue);

    char charValue = '가';
    intValue = charValue;
    System.out.println("가의 유니코드=" + intValue);
    
    intValue = 500;
    long longValue = intValue;;
    System.out.println(longValue);		
    
    intValue = 200;
    double doubleValue = intValue;
    System.out.println(doubleValue);	
    
    
    10
    가의 유니코드=44032
    500
    200.0
		
```

### 2.3.1 강제 타입 변환 
        
    작은 변수에 큰 변수 타입을 저장시 발생 
    크기에 따라 넘어가는 데이터는 짤림 

```java
int intValue = 44032;
char charValue = (char) intValue;
System.out.println(charValue);

long longValue = 500;
intValue = (int) longValue;
System.out.println(intValue);

double doubleValue = 3.14;
intValue = (int) doubleValue;
System.out.println(intValue);	

가
500
3
```

```java
int i = 128;
	  
if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE) ) {
    System.out.println("byte 타입으로 변환할 수 없습니다.");
    System.out.println("값을 다시 확인해 주세요");
} else {
    byte b = (byte) i;
    System.out.println(b);
}

byte 타입으로 변환할 수 없습니다.
값을 다시 확인해 주세요
```

 ```java
int num1 = 123456780;
int num2 = 123456780;

float num3 = num2;
num2 = (int) num3;

int result = num1 - num2;
System.out.println(result);

-4
```

 ```java
int num1 = 123456780;
int num2 = 123456780;

double num3 = num2;
num2 = (int) num3;

int result = num1 - num2;
System.out.println(result);

0
```

### 2.3.3 연산식에서의 자동 타입 변환

        크기에 따라 자동및 강제 형변환 된다는 걸 이해하자
        정수는 int 연산 된다는 이해 하자 

 ```java
byte byteValue1 = 10;
byte byteValue2 = 20;
//byte byteValue3 = byteValue1 + byteValue2;   //에러 
int intValue1 = byteValue1 + byteValue2;
System.out.println(intValue1);

char charValue1 = 'A';
char charValue2 = 1;
//char charValue3 = charValue1 + charValue2;   //에러 
int intValue2 = charValue1 + charValue2;
System.out.println("유니코드=" + intValue2);
System.out.println("출력문자=" + (char)intValue2);

int intValue3 = 10;
int intValue4 = intValue3/4;
System.out.println(intValue4);

int intValue5 = 10;
//int intValue6 = 10 / 4.0;   //에러 
double doubleValue = intValue5 / 4.0;
System.out.println(doubleValue);
   
30
유니코드=66
출력문자=B
2
2.5


```

 	