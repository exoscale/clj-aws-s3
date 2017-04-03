(defproject ch.exoscale/clj-aws-s3 "0.3.10"
  :description "Clojure Amazon S3 library"
  :url "https://github.com/weavejester/clj-aws-s3"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.amazonaws/aws-java-sdk "1.11.106"]
                 [org.apache.httpcomponents/httpclient "4.5.2" ]
                 [clj-time "0.13.0"]]
  :plugins [[codox "0.8.10"]])
