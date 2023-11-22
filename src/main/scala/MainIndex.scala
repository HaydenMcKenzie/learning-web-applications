import org.scalajs.dom
import org.scalajs.dom.document

object MainIndex {

  def main(args: Array[String]): Unit = {
    println("Hello world!")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }
}