package tariffs;

import java.util.NoSuchElementException;
import java.util.Objects;

public class TariffList implements TariffPolicy {

    private TariffNode head;
    private int size;

    public TariffList() {
        head = null;
        size = 0;
    }

    public TariffList(TariffList tariffList) {
        this.head = new TariffNode(tariffList.head);
        TariffNode current = head;
        while(current.next != null) {
            current = new TariffNode(current.next);
        }
        this.size = tariffList.size;
    }

    public void addToStart(Tariff tariff) {
        head = new TariffNode(tariff, head);
        size++;
    }

    public void addAtIndex(int index, Tariff tariff) throws NoSuchElementException {
        if (index < 0 || index >= size) {
            throw new NoSuchElementException();
        }else{
            if(head == null) {
                head = new TariffNode(tariff, null);
            }else if(index == 0) {
                head = new TariffNode(tariff, head);
            }else{
                TariffNode current = head;
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                current.next = new TariffNode(tariff, current.next);
            }
            size++;
        }
    }

    public void deleteFromIndex(int index) throws NoSuchElementException {
        if (index < 0 || index > size) {
            throw new NoSuchElementException();
        }else{
            if(index == 0) {
                head = head.next;
            }else {
                TariffNode current = head;
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }
            size--;
        }
    }

    public void deleteFromStart() {
        if(head != null) {
            head = head.next;
            size--;
        }
    }

    public void replaceAtIndex(int index, Tariff tariff) {
        if (index >= 0 && index < size){
            if(head == null) {
                head = new TariffNode(tariff, null);
            }else if(index == 0) {
                head = new TariffNode(tariff, head.next);
            }else{
                TariffNode current = head;
                for (int i = 1; i < index; i++) {
                    current = current.next;
                }
                current.next = new TariffNode(tariff, current.next.next);
            }
        }
    }


    private static class TariffNode{
        private Tariff tariff;
        private TariffNode next;

        public TariffNode(){
            tariff = null;
            next = null;
        }

        public TariffNode(Tariff tariff, TariffNode next){
            this.tariff = new Tariff(tariff);
            this.next = next;
        }

        public TariffNode(TariffNode node){
            this.tariff = new Tariff(node.tariff);
            this.next = node.next;
        }

        public TariffNode clone(TariffNode node){
            return new TariffNode(node);
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            TariffNode that = (TariffNode) o;
            return tariff.equals(that.tariff) && next == that.next;
        }

        public Tariff getTariff() {
            return new Tariff(tariff);
        }

        public void setTariff(Tariff tariff) {
            this.tariff = new Tariff(tariff);
        }

        public TariffNode getNext() {
            return next;
        }

        public void setNext(TariffNode next) {
            this.next = next;
        }
    }

    @Override
    public String toString() {
        String result = "TariffList: [";

        TariffNode current = head;
        while (current != null) {
            result += current.tariff;
            if (current.next != null) {
                result += ", \n";
            }
            current = current.next;
        }

        result += "]";
        return result;
    }


    public TariffNode find(String origin, String destination, String category) {
if (head == null) {
    return null;
}
TariffNode current = head;

while (current != null) {
    if (origin.equals(current.tariff.getOriginCountry())
            && destination.equals(current.tariff.getDestinationCountry())
            && category.equals(current.tariff.getProductCategory())){
        return current;
    }
    current = current.next;
}
return null;
    }

    public boolean contains(String origin, String destination, String category) {
        if (head == null) {
            return false;
        }
        TariffNode current = head;

        while (current != null) {
            if (origin.equals(current.tariff.getOriginCountry())
                    && destination.equals(current.tariff.getDestinationCountry())
                    && category.equals(current.tariff.getProductCategory())){
                return true;
            }
            current = current.next;
        }
        return false;
    }

        public boolean equals(TariffList tList) {
        TariffNode current = head;
        while (current != null) {
            if(){

            }

            }
        }




    @Override
    public String evaluateTrade(double proposedTariff, double minimumTariff) {
        return "";
    }
}
