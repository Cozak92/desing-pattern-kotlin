package Composite

/**
 * Node 클래스는 기본적인 파일 및 디렉토리의 근간이라고 가정합니다.
 * 모든 파일과 디렉토리는 이름을 가지고 있을테니 이름을 반환할 getName() 메소드를 가집니다.
 */
interface Node {
    val name: String?
}

/**
 * File 클래스는 Node 인터페이스를 구현하면 끝입니다. 자신은 자식 요소를 가질 필요가 없기 때문이죠.
 */
class File : Node {
    // ...
    override val name: String? = null
}

/**
 * Directory 클래스는 Node 인터페이스를 구현하는 것 외에도 자식 요소를 담아둘 List가 필요합니다.
 */
class Directory : Node {
    // ...
    override val name: String? = null
    private val children: MutableList<Node>? = null
    fun add(node: Node) {
        children!!.add(node)
    }
}
fun main(args: Array<String>) {
    val dir = Directory()
    dir.add(File()) // 디렉토리에 파일 하나를 삽입!
    dir.add(Directory()) // 디렉토리에 디렉토리를 삽입!

    val secondDir = Directory()
    secondDir.add(dir) // 기존 루트 디렉토리를 새로 만든 디렉토리에 삽입!

}