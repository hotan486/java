# 변수와 타입 

## 목차 

[2.1 변수](#2.1-변수) 
 
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

