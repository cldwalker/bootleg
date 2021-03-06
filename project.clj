(defproject bootleg #= (clojure.string/trim #= (slurp ".meta/VERSION"))
  :description "Simple template processing command line tool to help build static websites"
  :url "https://github.com/retrogradeorbit/bootleg"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.2-alpha1"]
                 [org.clojure/tools.cli "0.4.2"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/data.xml "0.2.0-alpha6"]
                 [markdown-clj "1.10.0"]

                 [io.forward/yaml "1.0.10"]

                 [cljstache "2.0.4"]
                 [enlive "1.1.6"]
                 [hickory "0.7.1"]
                 [selmer "1.12.17"]

                 ;; for clojure eval
                 [borkdude/sci "0.0.13-alpha.24"]

                 ;; clojures pprint doesn't work under graal native-image
                 [fipp "0.6.23"]
                 [mvxcvi/puget "1.2.0"]

                 ;; pod support
                 [nrepl/bencode "1.1.0"]
                 ]
  :java-source-paths ["src/java" "sci-reflector/src-java"]
  :test-paths ["test/clojure"]

  :main ^:skip-aot bootleg.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
