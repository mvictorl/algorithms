public class Graphs {
    public static boolean Breadth () {
        return true;
    }

}

/* https://russianblogs.com/article/68261004575/
import java.io.IOException;
import java.util.Scanner;

public class graphTraversal {
	private char[] vertex;    // Коллекция вершин
	private int[][] matrix;   // Матрица смежности
	private static final int INF = 999999; // Максимум
	private static int count = 0;

// Создать график
public graphTraversal() {
    Scanner sca = new Scanner(System.in);
    int vertexNum = sca.nextInt();                 // Количество вершин
    int matrixNum = sca.nextInt();                 // Количество сторон
    vertex        = new char[vertexNum];
    vertex = sca.next().toCharArray();             // Инициализируем вершину
    // Инициализируем матрицу
    matrix = new int [vertexNum][vertexNum];
    for(int i = 0; i < vertexNum; i++)
        for(int j = 0; j < vertexNum; j++)
            matrix[i][j] = 	(i == j) ?  0 : INF;
    for(int i = 0; i < matrixNum; i++) {           // Инициализируем вес ребра
        char start     = readChar();               // Начальная точка края
        char end       = readChar();               // Конец ребра
        int weight     = sca.nextInt();            // Вес края
        int startInedx = getLocation(start);       // Получаем координаты начальной точки края
        int endIndex   = getLocation(end);         // Получаем координаты конечной точки края
        if(startInedx == -1 || endIndex == -1) return;
        matrix[startInedx][endIndex] = weight;
        matrix[endIndex][startInedx] = weight;
    }
    sca.close();
}

// График прохождения поиска по глубине
    public void DFS() {
        boolean[] visited = new boolean[vertex.length]; // Записываем метку доступа к вершине
        // Инициализируем все вершины не посещаются
        for(int i = 0; i < vertex.length; i++)
            visited[i] = false;
        System.out.println("Переход DFS:" );
        for(int i = 0; i < vertex.length; i++) {
            if(!visited[i])
                DFS(i, visited);
        }
        System.out.println();
    }

// Рекурсивная реализация графа обхода поиска в глубину
    private void DFS(int i, boolean[] visited) {
        count++;
        visited[i] = true;
        if(count == vertex.length) {
            System.out.println(vertex[i]);
        }else {
            System.out.print(vertex[i] + "————>");
        }
        // Обходим все соседние вершины вершины, если она не была посещена, продолжаем
        for(int j = firstVertex(i); j >= 0; j = nextVertex(i, j)) {
            if(!visited[j])
                DFS(j, visited);
        }
    }

// Поиск в ширину (обход уровня дерева аналогий)
    public void BFS() {
        count = 0;                                      // Количество точек хода возвращается к 0
        int head = 0;
        int rear = 0;
        int[] queue = new int[vertex.length];           // вспомогательная очередь
        boolean[] visited = new boolean[vertex.length]; // Метка доступа к вершине
        for(int i = 0; i < vertex.length; i++)
            visited[i] = false;
        System.out.println("BFS:");
        for(int i = 0; i < vertex.length; i++) {
            if(!visited[i]) {
                count++;
                visited[i] = true;
                if(count == vertex.length) {
                    System.out.print(vertex[i]);
                }else {
                    System.out.print(vertex[i] + "————>");
                }
                queue[rear++] = i;                      // Поставить в очередь
            }
            while(head != rear) {
                int j = queue[head++];                  // Вне очереди
                for(int k = firstVertex(j); k >= 0; k = nextVertex(j, k)) { // k - соседняя вершина для посещения
                    if(!visited[k]) {
                        visited[k] = true;
                        count++;
                        if(count == vertex.length) {
                            System.out.print(vertex[k]);
                        }else {
                            System.out.print(vertex[k] + "————>");
                        }
                        queue[rear++] = k;
                    }
                }
            }
        }
        System.out.println();
    }

// Вернуть индекс первой смежной вершины вершины v, вернуть -1 в случае неудачи
    private int firstVertex(int v) {
        if(v < 0 || v > (vertex.length - 1))
            return -1;
        for(int i = 0; i < vertex.length; i++) {
            if(matrix[v][i] != 0 && matrix[v][i] != INF) {
                return i;
            }
        }
        return -1;
    }

//  Возвращает индекс следующей смежной вершины вершины v относительно w или -1 в случае ошибки
    private int nextVertex(int v, int j) {
        if(v < 0 || v > (vertex.length - 1) || j < 0 || j > (vertex.length - 1))
            return -1;
        for(int i = j + 1; i < vertex.length; i++) {
            if(matrix[v][i] != 0 && matrix[v][i] != INF)
                return i;
        }
        return -1;
    }

//Прочитать введенный символ
//  @return
    private char readChar() {
        char ch = '0';
        do {
            try {
                ch = (char)System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')));
        return ch;
    }

// Вернуть позицию персонажа
    private int getLocation(char c) {
        for(int i = 0; i < vertex.length; i++)
            if(vertex[i] == c) return i;
        return -1;
    }
    public static void main(String[] args) {
        graphTraversal gra = new graphTraversal();
        gra.DFS();                       // Обход глубины
        gra.BFS();                       // Обход в ширину
    }
}


*/

/* https://habr.com/ru/company/otus/blog/660725/
// Алгоритм поиска в глубину на Java
import java.util.*;

class Graph {
  private LinkedList<Integer> adjLists[];
  private boolean visited[];

  // Создание графа
  Graph(int vertices) {
    adjLists = new LinkedList[vertices];
    visited = new boolean[vertices];

    for (int i = 0; i < vertices; i++)
      adjLists[i] = new LinkedList<Integer>();
  }

  // Добавление ребер
  void addEdge(int src, int dest) {
    adjLists[src].add(dest);
  }

  // Алгоритм
  void DFS(int vertex) {
    visited[vertex] = true;
    System.out.print(vertex + " ");

    Iterator<Integer> ite = adjLists[vertex].listIterator();
    while (ite.hasNext()) {
      int adj = ite.next();
      if (!visited[adj])
        DFS(adj);
    }
  }

  public static void main(String args[]) {
    Graph g = new Graph(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 3);

    System.out.println("Following is Depth First Traversal");

    g.DFS(2);
  }
}
*/