# clj-aws-s3

A Clojure library for accessing Amazon S3, based on the official AWS
Java SDK.

Although there are a few S3 clients for Clojure around, this library
aims to provide a more complete implementation, with metadata, streams
and protocols for uploading different types of data.

Currently the library supports functions to create, list and delete
buckets, to list, get, and put objects and their metadata, and to get
and update the access control lists (ACLs) for buckets and objects.

## Install

Add the following dependency to your `project.clj` file:

    [clj-aws-s3 "0.3.11"]

## Example

```clojure
(require '[aws.sdk.s3 :as s3])

;This is a fork of weavejester clj-aws-s3 that lets the aws-sdk resolve credentials.
;Therefore you do not need to manually create your credentials. 


(s3/create-bucket "my-bucket")

(s3/put-object "my-bucket" "some-key" "some-value")

(s3/update-object-acl "my-bucket" "some-key" (s3/grant :all-users :read))

(println (slurp (:content (s3/get-object "my-bucket" "some-key"))))

;You should be able to set via your environment variables or IAM role or in ~/.aws/credentials file.
;In case you truly want to set the keys your self, initialize your s3client like so
 
(s3-client :access-key "AAAAAA" :secret-key "SSSSSS")

; or include an optional token
(s3-client :access-key "AAAAAA" :secret-key "SSSSSS" :token "accesstoken")

These should not be required when using IAM roles in amazon.

```

## Documentation

* [API docs](http://weavejester.github.com/clj-aws-s3/)

## License

Copyright © 2014 James Reeves

Distributed under the Eclipse Public License, the same as Clojure.
