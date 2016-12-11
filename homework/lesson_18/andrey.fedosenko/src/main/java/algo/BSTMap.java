package algo;

public class BSTMap<K extends Comparable, V> {
  private Node root;

  private class Node {
    private K key;
    private V value;
    private Node left;
    private Node right;
    private int size;

    public Node(K key, V value, int size) {
      this.key = key;
      this.value = value;
      this.size = size;
    }
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public int size() {
    return size(root);
  }

  private int size(Node node) {
    if (node == null) {
      return 0;
    } else {
      return node.size;
    }
  }


  public void put(K key, V value) {
    root = put(root, key, value);
  }

  @SuppressWarnings("unchecked")
  private Node put(Node node, K key, V value) {
    if (node == null) {
      return new Node(key, value, 1);
    } else {
      int cmp = key.compareTo(node.key);
      if (cmp < 0) {
        node.left = put(node.left, key, value);
      } else if (cmp > 0) {
        node.right = put(node.right, key, value);
      } else {
        node.value = value;
      }
    }
    return node;
  }

  public V get(K key) {
    return get(root, key);
  }

  @SuppressWarnings("unchecked")
  public V get(Node node, K key) {
    if (node == null) {
      return null;
    } else {
      int cmp = key.compareTo(node.key);
      if (cmp < 0) {
        return get(node.left, key);
      } else if (cmp > 0) {
        return get(node.right, key);
      } else {
        return node.value;
      }
    }
  }

  public void delete(K key) {
    if (key != null) {
      root = delete(root, key);
    }
  }

  @SuppressWarnings("unchecked")
  private Node delete(Node node, K key) {
    if (node == null) {
      return null;
    }

    int cmp = key.compareTo(node.key);
    if (cmp < 0) {
      node.left  = delete(node.left,  key);
    } else if (cmp > 0) {
      node.right = delete(node.right, key);
    } else {
      if (node.right == null) {
        return node.left;
      }
      if (node.left  == null) {
        return node.right;
      }

      Node temp = node;
      node = min(temp.right);
      node.right = deleteMin(temp.right);
      node.left = temp.left;
    }
    node.size = size(node.left) + size(node.right) + 1;
    return node;
  }

  public K min() {
    if (isEmpty()) {
      return null;
    }
    return min(root).key;
  }

  private Node min(Node node) {
    if (node.left == null) {
      return node;
    } else {
      return min(node.left);
    }
  }

  public void deleteMin() {
    if (!isEmpty()) {
      root = deleteMin(root);
    }
  }

  private Node deleteMin(Node node) {
    if (node.left == null) {
      return null;
    }
    node.left = deleteMin(node.left);
    node.size = size(node.left) + size(node.right) + 1;
    return node;
  }

}
