package io.grpc.internal;

import java.io.Closeable;
import java.util.zip.DataFormatException;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes3.dex */
public final class GzipInflatingBuffer implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37223d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final State f37224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ State[] f37225c;

        static {
            State state = new State("HEADER", 0);
            f37224b = state;
            f37225c = new State[]{state, new State("HEADER_EXTRA_LEN", 1), new State("HEADER_EXTRA", 2), new State("HEADER_NAME", 3), new State("HEADER_COMMENT", 4), new State("HEADER_CRC", 5), new State("INITIALIZE_INFLATER", 6), new State("INFLATING", 7), new State("INFLATER_NEEDS_INPUT", 8), new State("TRAILER", 9)};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f37225c.clone();
        }
    }

    public class a {
        public final int a() {
            throw null;
        }
    }

    public final int b(byte[] bArr, int i10, int i11) throws ZipException, DataFormatException {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }
}
