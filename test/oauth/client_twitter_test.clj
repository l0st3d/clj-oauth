(ns oauth.client-twitter-test
  (:require [oauth.client :as oc])
  (:use clojure.test)
  (:load "twitter_keys"))

(def consumer (oc/make-consumer consumer-key
                                consumer-secret
                                "https://api.twitter.com/oauth/request_token"
                                "https://api.twitter.com/oauth/access_token"
                                "https://api.twitter.com/oauth/authorize"
                                :hmac-sha1))
(deftest
    #^{:doc "Test requesting a token from Twitter.
            Considered to pass if no exception is thrown."}
  request-token
  (oc/request-token consumer))