(ns immutant-testing-profiles.core-test
  (:require [clojure.test :refer :all]
            [immutant.registry]))

;; Test with 'lein with-profile magic immutant test'
(deftest magic-test
  (is (= (:fuel-type (immutant.registry/get :config)) "pixie dust")))
