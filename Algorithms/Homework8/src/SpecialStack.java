import java.util.*;

import static java.util.Collections.min;


//  1 уровень сложности: Задача getMin().
//Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком,
// такие как push(), pop(), isEmpty(), … и дополнительную операцию getMin(),
// которая должна возвращать минимальный элемент из SpecialStack.

public class SpecialStack{

    public int count;
    public ArrayList<Integer> items;
        public SpecialStack() {
            this.count = 0;
            this.items = new ArrayList<>();
        }

        public void push(int element) {
            this.items.add(element);
            this.count++;
        }

        public int pop() {
            if (this.count == 0) {
                throw new EmptyStackException();
            }
            int deletedItem = this.items.remove(this.count - 1);
            this.count--;
            return deletedItem;
        }

        public int size() {
            return this.count;
        }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public void clear() {
        this.items.clear();
        this.count = 0;
    }
        public int peek() {
            if (this.count == 0) {
                throw new EmptyStackException();
            }
             return this.items.get(this.count - 1);
        }

        public int getMin() {
        int min = this.items.get(0);
            for (int item : this.items) {
                if (item < min) min = item;
            }
        return min;
     }

    }

