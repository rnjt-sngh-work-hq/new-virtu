(defproject new-reliquary "0.1.0"
  :description "Clojure newrelic java api wrapper"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.newrelic.agent.java/newrelic-api "3.5.1"]]
  :profiles { :dev { :dependencies [[ring/ring-core "1.3.0-RC1"]
                                    [ring-mock "0.1.5"]
                                    [org.clojure/tools.trace "0.7.6"]]}})