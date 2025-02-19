マルチスレッドのテストに向けて書いたコード

# ディレクトリ構成
```shell
multi-thread-test
├── README.md
├── lib             　... ライブラリのJavaプログラムを格納するディレクトリ(libcobjの代わり)
│   └── MTBase.java
└── tests           　... テストコードを格納するディレクトリ
    ├── MTTest.java 　... マルチスレッドのテスト用のプログラム
    └── STTest.java　... シングルスレッドのテスト用のプログラム
```

# コンパイルと実行

`MTTest.java` を実行する場合
```shell
$ javac -d . -cp . tests/MTTest.java
$ java -cp . tests.MTTest
```
