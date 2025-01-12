package com.MyBatisLearning;
import org.w3c.dom.*;

import javax.xml.parsers.*;
public class lesson1 {
    public static void main(String[] args) {
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
// 创建DocumentBuilder对象
try {
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document d = builder.parse("D:\\Document\\JavaWebLearning\\src\\com\\MyBatisLearning\\test.xml");
    // 每一个标签都作为一个节点
    NodeList nodeList = d.getElementsByTagName("outer");  // 可能有很多个名字为test的标签
 if (nodeList.getLength() > 0) {
                Node rootNode = nodeList.item(0); // 获取 outer 标签
                NodeList childNodes = rootNode.getChildNodes(); // 获取 outer 标签下的所有子节点

                // 遍历子节点
                for (int i = 0; i < childNodes.getLength(); i++) {
                    Node child = childNodes.item(i);
                    if (child.getNodeType() == Node.ELEMENT_NODE) { // 过滤文本节点和空白节点
                        String nodeName = child.getNodeName();
                        String nodeValue = child.getFirstChild() != null ? child.getFirstChild().getNodeValue() : "";
                        System.out.println(nodeName + "：" + nodeValue);

                        // 如果节点是 inner，还可以获取其属性
                       if (nodeName.equals("inner")) {
                            // 获取 inner 的属性
                            String type = child.getAttributes().getNamedItem("type").getNodeValue();
                            System.out.println("inner type属性值：" + type);

                            // 遍历 inner 标签的子节点（如 age 和 sex）
                            NodeList innerChildNodes = child.getChildNodes();
                            for (int j = 0; j < innerChildNodes.getLength(); j++) {
                                Node innerChild = innerChildNodes.item(j);
                                if (innerChild.getNodeType() == Node.ELEMENT_NODE) {
                                    String innerNodeName = innerChild.getNodeName();
                                    String innerNodeValue = innerChild.getFirstChild() != null ? innerChild.getFirstChild().getNodeValue() : "";
                                    System.out.println(innerNodeName + "：" + innerNodeValue);
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("没有找到名为 'outer' 的标签！");
            }
} catch (Exception e) {
    e.printStackTrace();
}
    }
}
