package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: MessageLite.java */
/* JADX INFO: loaded from: classes3.dex */
public interface J extends K {
    ByteString b();

    int c();

    void f(OutputStream outputStream) throws IOException;

    void g(CodedOutputStream codedOutputStream) throws IOException;

    byte[] n();

    GeneratedMessageLite.a o();
}
