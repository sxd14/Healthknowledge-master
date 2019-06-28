package cn.edu.gdpt.healthknowledge.utils;

public class JsonParse {

        private static JsonParse instance;
    private String jsonData;

    private JsonParse() {
        }
        public static JsonParse getInstance() {
            if (instance == null) {
                instance = new JsonParse();
            }
            return instance;
        }
}
