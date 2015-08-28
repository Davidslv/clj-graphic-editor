(defproject graphic-editor "0.1.0-SNAPSHOT"
  :description "Graphic Editor Simulator"
  :url "http://github.com/davidslv/graphic-editor-simulator"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot graphic-editor.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
