package javalab.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapsDemo {
    record Diamond(String name) {}

    static class Shop {
        private final String name;

        Shop(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Shop shop)) return false;
            return Objects.equals(name, shop.name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) {
        Map<Shop, Diamond> shops = new HashMap<>();
        shops.put(new Shop("Shop A"),  new Diamond("A"));
        // System.out.println(shops.get(new Shop("Shop A"))); // null before overriding the hash

        shops.put(new Shop("Shop B"),  new Diamond("B"));

        System.out.println(new  Shop("Shop B").hashCode());
        System.out.println(new  Shop("Shop B").hashCode());

        System.out.println(shops.get(new Shop("Shop A")));
    }
}
