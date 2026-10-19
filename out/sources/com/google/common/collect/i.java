package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: ComparisonChain.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27974a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f27975b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f27976c = new b(1);

    /* JADX INFO: compiled from: ComparisonChain.java */
    public class a extends i {
        public static i f(int i10) {
            if (i10 < 0) {
                return i.f27975b;
            }
            return i10 > 0 ? i.f27976c : i.f27974a;
        }

        @Override // com.google.common.collect.i
        public final i a(int i10, int i11) {
            return f(Integer.compare(i10, i11));
        }

        @Override // com.google.common.collect.i
        public final <T> i b(T t8, T t10, Comparator<T> comparator) {
            return f(comparator.compare(t8, t10));
        }

        @Override // com.google.common.collect.i
        public final i c(boolean z10, boolean z11) {
            return f(Boolean.compare(z10, z11));
        }

        @Override // com.google.common.collect.i
        public final i d(boolean z10, boolean z11) {
            return f(Boolean.compare(z11, z10));
        }

        @Override // com.google.common.collect.i
        public final int e() {
            return 0;
        }
    }

    public abstract i a(int i10, int i11);

    public abstract <T> i b(T t8, T t10, Comparator<T> comparator);

    public abstract i c(boolean z10, boolean z11);

    public abstract i d(boolean z10, boolean z11);

    public abstract int e();

    /* JADX INFO: compiled from: ComparisonChain.java */
    public static final class b extends i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27977d;

        public b(int i10) {
            this.f27977d = i10;
        }

        @Override // com.google.common.collect.i
        public final int e() {
            return this.f27977d;
        }

        @Override // com.google.common.collect.i
        public final i a(int i10, int i11) {
            return this;
        }

        @Override // com.google.common.collect.i
        public final i c(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.i
        public final i d(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.i
        public final <T> i b(T t8, T t10, Comparator<T> comparator) {
            return this;
        }
    }
}
