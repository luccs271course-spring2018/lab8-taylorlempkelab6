package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    // TODO
    // DONE
    if (size < capacity) {
      rear = (rear + 1) % capacity;
      data[rear] = obj;
      size++;
      return ture;
    } else {
      return false;
    }
  }

  @Override
  public E peek() {
    // TODO
    // DONE
    if (!isEmpty())
    {
      return data[rear];
    }
    else {
      return null;
    }
  }

  @Override
  public E poll() {
    // TODO
    // DONE
    if (!isEmpty()) {
      E result = data[front];
      front = (front + 1) % capacity;
      size--;
      return result;
    } else {
    return null;
    }
  }

  @Override
  public boolean isEmpty() {
    // TODO
    // DONE
    if (size == 0)
    {
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    // DONE
    
    List<E> list = new ArrayList<>(capacity);
    while (!isEmpty())
    {
      list.add(data[front]);
      front = (front+1) % capacity;
      size--;
    }
    return list;
  }
}
