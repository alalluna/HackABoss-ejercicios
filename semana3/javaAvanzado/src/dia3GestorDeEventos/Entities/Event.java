package dia3GestorDeEventos.Entities;

import java.time.LocalDate;

public class Event {
        private String name;
        private LocalDate date;
        private String category;

        //constructor

        public Event(String name, LocalDate date, String category) {
            this.name = name;
            this.date = date;
            this.category = category;
        }

        //getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        //tostring
        @Override
        public String toString() {
            return  "El evento " + name + " (categoria: " + category + ") con fecha: " + date;
        }
}
