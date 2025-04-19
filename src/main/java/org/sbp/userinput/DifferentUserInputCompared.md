# Reading User Input: Scanner Vs BufferedReader

### 1) Package: 
#### Scanner: It is a part of java.util package.

#### BufferedReader: It is a part of java.io package.

### 2) Key use

#### Scanner: Simple parsing of primitive types and strings

#### BufferedReader: High-performance text reading

### 3) Performance

#### Scanner: Performance is slower due to parsing overhead and tokenization

#### BufferedReader: Performance is faster due to efficient buffering

### 4) Buffer Size

#### Scanner: Buffer Size is smaller

#### BufferedReader: Buffer Size is larger

### 5) Thread-safe

#### Scanner: It is not thread-safe

#### BufferedReader: It is thread-safe

### 6) Error Handling

#### Scanner: Throws Exception like InputMismatchException

#### BufferedReder: Throws Exception like IOException