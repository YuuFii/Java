package MengacakKartu;

import java.util.Scanner;

class Node<T> {
    T huruf;
    Node<T> next;

    Node(T huruf) {
        this.huruf = huruf;
        this.next = null;
    }
}

class Queue<T> {
    Node<T> rear;
    Node<T> front;
    int size;

    Queue() {
        front = rear = null;
        size = 0;
    }

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(T huruf) {
        Node<T> newNode = new Node<>(huruf);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }


    Node<T> dequeue() {
        Node<T> temp = front;
        if (isEmpty()) {
            return null;
        } else {
            front = front.next;
        }

        if (front == null) {
            rear = null;
        }

        size--;
        return temp;
    }

    int getSize() {
        return this.size;
    }

    void printQueue() {
        Node<T> currentNode = front;
        while (currentNode != null) {
            System.out.print(currentNode.huruf);
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Character> urutanKartu = new Queue<>(); // Ini buat queue urutan kartu

        String huruf = input.nextLine();

        for (char h : huruf.toCharArray()) { // Dari string diubah jadi array character
            urutanKartu.enqueue(h);
        }

        int n = input.nextInt();

        Queue<Character> hasilRiffleShuffle = riffleShuffle(urutanKartu, n);

        hasilRiffleShuffle.printQueue();
        input.close();
    }

    public static Queue<Character> riffleShuffle(Queue<Character> urutanKartu, int n) { // Ini buat mengacak kartu
        if (n == 0) { // Kondisi ketika mengacak kartu sudah selesai
            return urutanKartu; // maka me-return hasil acakan kartu
        }

        Queue<Character> urutanPertama = new Queue<>();
        Queue<Character> urutanKedua = new Queue<>();

        int bagiDua = urutanKartu.getSize() / 2;

        if (urutanKartu.getSize() % 2 == 0) {
            for (int i = 0; i < bagiDua; i++) {
                urutanPertama.enqueue(urutanKartu.dequeue().huruf);
            }
        } else {
            for (int i = 0; i < bagiDua + 1; i++) {
                urutanPertama.enqueue(urutanKartu.dequeue().huruf);
            }
        }

        int ukuranAwal = urutanKartu.getSize();
        for (int i = 0; i < ukuranAwal; i++) {
            urutanKedua.enqueue(urutanKartu.dequeue().huruf);
        }

        Queue<Character> hasilRiffleShuffle = new Queue<>();

        while (!urutanPertama.isEmpty() && !urutanKedua.isEmpty()) {
            hasilRiffleShuffle.enqueue(urutanPertama.dequeue().huruf);
            hasilRiffleShuffle.enqueue(urutanKedua.dequeue().huruf);
        }

        while (!urutanPertama.isEmpty()) {
            hasilRiffleShuffle.enqueue(urutanPertama.dequeue().huruf);
        }

        while (!urutanKedua.isEmpty()) {
            hasilRiffleShuffle.enqueue(urutanKedua.dequeue().huruf);
        }

        return riffleShuffle(hasilRiffleShuffle, n - 1); // Pake rekursif untuk mengacak kartu sebanyak n
    }
}

