(defproject immutant-testing-profiles "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :immutant {:fuel-type "fossil"}
  :profiles {:magic {:immutant {:fuel-type "pixie dust"}}}
  :plugins [[lein-immutant "1.2.1"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.immutant/immutant "1.1.2"]])
