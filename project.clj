(defproject clj-aws-s3 "0.3.11"
  :description "Clojure Amazon S3 library"
  :url "https://github.com/weavejester/clj-aws-s3"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.amazonaws/aws-java-sdk "1.9.17"]
                 [clj-time "0.6.0"]
                 [org.clojure/core.memoize "0.5.6"]]
  :plugins [[codox "0.8.10"]])
