| <br />Type | Description             | Default | Size    | Example Literals                                 | Range of Values                                             |
| ---------- | ----------------------- | ------- | ------- | ------------------------------------------------ | ----------------------------------------------------------- |
| boolean    | true or false           | false   | 8 bits  | true, false                                      | true, false                                                 |
| byte       | twos-complement integer | 0       | 8 bits  | (none)                                           | -128<br /> to 127                                           |
| char       | Unicode character       | \u0000  | 16 bits | 'a', '\u0041', '\101',<br /> '\', '', '\n', 'β' | 0 to<br />65535                                             |
| short      | twos-complement integer | 0       | 16 bits | (none)                                           | -32,768 to<br />32,767                                      |
| int        | twos-complement integer | 0       | 32 bits | -2, -1, 0, 1, 2                                  | -2,147,483,648<br />to 2,147,483,647                        |
| long       | twos-complement integer | 0       | 64 bits | -2L, -1L, 0L, 1L, 2L                             | -9,223,372,036,854,775,808<br />to9,223,372,036,854,775,807 |
| float      | IEEE 754 floating point | 0.0     | 32 bits | 1.23e100f, -1.23e-100f,<br /> .3f, 3.14F         | up to 7 decimal digits                                      |
| double     | IEEE 754 floating point | 0.0     | 64 bits | 1.23456e300d,<br />-123456e-300d, 1e1d           | up to 16 decimal digits                                     |

---

##### **Primitive Data Types
|
|-- boolean
|-- char
|-- Numeric Types
    |
    |-- Integral Types
    |   |
    |   |-- byte
    |   |-- short
    |   |-- int
    |   |-- long
    |
    |-- Floating Point Types
        |
        |-- float
        |-- double**
