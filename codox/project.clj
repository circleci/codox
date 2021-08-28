(defproject org.clojars.karo/codox "0.11.0"
  :description "Generate documentation from Clojure source files"
  :url "https://github.com/karolinepauls/codox"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/tools.namespace "0.2.11"]
                 [org.clojure/clojurescript "1.10.866"]
                 [hiccup "1.0.5"]
                 [enlive "1.1.6"]
                 [org.pegdown/pegdown "1.6.0"]
                 [org.ow2.asm/asm-all "5.0.3"]])
