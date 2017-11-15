# Java note

## Java 控制可见性的4个访问修饰符

- 仅对本类可见 —— `private`（子类可用`super`调用）
- 对所有类可见 —— `public`
- 对本包和所有子类可见 —— `protect`
- 对本包可见 —— 不需要修饰符

## equals 特性

### 自反性

- `x.equals(x`) 返回 `true`

### 对称性

- 对于任何引用 `x` 和 `y` ， `x.equals(y)` 返回 `true` 那么 `y.equals(x)` 也返回 `true`

### 传递性

- 对于任何引用 `x`，`y`, `z`, 如果 `x.equals(y)` 为 `true`， `y.equals(z)` 为 `true`， 那么 `x.equals(z)` 为 `true`

### 一致性

- 如果 `x` 和 `y` 引用的对象没有发生改变，反复调用`x.equals(y)` 应该返回同样的结果。

### 非空不等性

- 对于任意非空引用 `x`，`x.equals(null)` 返回 `false`

## 编写完美equals方法

- 显式参数命名为 `otherObject`
- 检测 `this` 与 `otherObjcet` 是否引用同一个对象    
`if (this == otherObject) return true;`
- 检测 `otherObject` 是否引用为 `null`， 返回 `false`  
`if (otherObject == null) return false;`
- 比较 `this` 与 `otherObject` 是否属于同一个类。  
如果 `equals` 在每一个子类中有所改变，使用 `getClass` 检测：  
`if (getClass() != otherObject.getClass()) return false;`   
如果所有子类拥有统一语义，使用 `instanceof` 检测：  
`if (!(otherObject instanceof ClassName)) return false`
- 将 `otherObject` 转换为相应的类类型变量：  
`ClassName other = (ClassName) otherObject`
- 比较。使用 `==` 比较基本类型域， 使用 `equals` 比较对象域。均匹配返回 `true`，否侧 `false`。