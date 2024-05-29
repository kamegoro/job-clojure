(defproject job-clojure2 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [duct/core "0.8.0"]
                 [duct/module.ataraxy "0.3.0"]
                 [duct/module.logging "0.5.0"]
                 [duct/module.sql "0.6.1"]
                 [duct/module.web "0.7.3"]
                 [com.layerware/hugsql "0.5.3"]
                 [com.github.seancorfield/next.jdbc "1.3.939"]
                 [inflections "0.14.2"]
                 [tick "0.7.5"]
                 [org.postgresql/postgresql "42.2.19"]
                 [metosin/ring-http-response "0.9.3"]]
  :plugins [[duct/lein-duct "0.12.3"]
            [dev.weavejester/lein-cljfmt "0.12.0"]]
  :main ^:skip-aot job-clojure2.main
  :resource-paths ["resources" "target/resources"]
  :prep-tasks     ["javac" "compile" ["run" ":duct/compiler"]]
  :middleware     [lein-duct.plugin/middleware]
  :profiles
  {:dev  [:project/dev :profiles/dev]
   :repl {:prep-tasks   ^:replace ["javac" "compile"]
          :repl-options {:init-ns user}}
   :uberjar {:aot :all}
   :profiles/dev {}
   :project/dev  {:source-paths   ["dev/src"]
                  :resource-paths ["dev/resources"]
                  :dependencies   [[integrant/repl "0.3.3"]
                                   [hawk "0.2.11"]
                                   [eftest "0.5.9"]
                                   [kerodon "0.9.1"]]}})
