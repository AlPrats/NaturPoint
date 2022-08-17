/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


public class DisplayItem {

        private String text;
        private int value;

        public DisplayItem(String text) {
                this.text = text;
        }

        public DisplayItem(int value) {
                this.value = value;
        }

        public DisplayItem(String text, int value) {
                this.text = text;
                this.value = value;
        }

        public String getText() {
                return text;
        }

        public void setText(String text) {
                this.text = text;
        }

        public int getValue() {
                return value;
        }

        public void setValue(int value) {
                this.value = value;
        }

        @Override
        // obtiene una representacion textual de un objeto
        public String toString() {
                return this.text;
        }

}
