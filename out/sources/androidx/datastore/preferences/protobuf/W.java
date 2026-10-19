package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Reader.java */
/* JADX INFO: loaded from: classes.dex */
public interface W {
    void A(List<String> list) throws IOException;

    ByteString B() throws IOException;

    void C(List<Float> list) throws IOException;

    int D() throws IOException;

    @Deprecated
    <T> void E(List<T> list, X<T> x10, C1323m c1323m) throws IOException;

    boolean F() throws IOException;

    int G() throws IOException;

    void H(List<ByteString> list) throws IOException;

    void I(List<Double> list) throws IOException;

    <T> void J(List<T> list, X<T> x10, C1323m c1323m) throws IOException;

    long K() throws IOException;

    String L() throws IOException;

    void M(List<Long> list) throws IOException;

    @Deprecated
    <T> T N(X<T> x10, C1323m c1323m) throws IOException;

    int a();

    <T> T b(X<T> x10, C1323m c1323m) throws IOException;

    void c(List<Integer> list) throws IOException;

    long d() throws IOException;

    long e() throws IOException;

    void f(List<Integer> list) throws IOException;

    void g(List<Long> list) throws IOException;

    void h(List<Integer> list) throws IOException;

    int i() throws IOException;

    boolean j() throws IOException;

    long k() throws IOException;

    void l(List<Long> list) throws IOException;

    int m() throws IOException;

    void n(List<Long> list) throws IOException;

    void o(List<Long> list) throws IOException;

    void p(List<Integer> list) throws IOException;

    void q(List<Integer> list) throws IOException;

    <K, V> void r(Map<K, V> map, C.a<K, V> aVar, C1323m c1323m) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    int s() throws IOException;

    void t(List<Integer> list) throws IOException;

    int u() throws IOException;

    long v() throws IOException;

    void w(List<Boolean> list) throws IOException;

    String x() throws IOException;

    int y() throws IOException;

    void z(List<String> list) throws IOException;
}
