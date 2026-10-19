package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ReadWriteBufferState.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f40613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.ktor.utils.io.internal.g f40614b;

    /* JADX INFO: compiled from: ReadWriteBufferState.kt */
    public static final class a extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f40615c = new a(io.ktor.utils.io.internal.f.f40627a, io.ktor.utils.io.internal.f.f40628b);

        public final String toString() {
            return "IDLE(empty)";
        }
    }

    /* JADX INFO: compiled from: ReadWriteBufferState.kt */
    public static final class b extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f40616c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c initial) {
            super(initial.f40613a, initial.f40614b);
            i.e(initial, "initial");
            this.f40616c = initial;
        }

        @Override // io.ktor.utils.io.internal.e
        public final e c() {
            return this.f40616c.f40620f;
        }

        @Override // io.ktor.utils.io.internal.e
        public final e d() {
            return this.f40616c.f40621g;
        }

        public final String toString() {
            return "IDLE(with buffer)";
        }
    }

    /* JADX INFO: compiled from: ReadWriteBufferState.kt */
    public static final class c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ByteBuffer f40617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ByteBuffer f40618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f40619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final d f40620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final g f40621g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final C0459e f40622h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, ByteBuffer backingBuffer) {
            super(backingBuffer, new io.ktor.utils.io.internal.g(backingBuffer.capacity() - i10));
            i.e(backingBuffer, "backingBuffer");
            if (backingBuffer.position() != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (backingBuffer.limit() != backingBuffer.capacity()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ByteBuffer byteBufferDuplicate = backingBuffer.duplicate();
            i.d(byteBufferDuplicate, "backingBuffer.duplicate()");
            this.f40617c = byteBufferDuplicate;
            ByteBuffer byteBufferDuplicate2 = backingBuffer.duplicate();
            i.d(byteBufferDuplicate2, "backingBuffer.duplicate()");
            this.f40618d = byteBufferDuplicate2;
            this.f40619e = new b(this);
            this.f40620f = new d(this);
            this.f40621g = new g(this);
            this.f40622h = new C0459e(this);
        }

        @Override // io.ktor.utils.io.internal.e
        public final ByteBuffer a() {
            return this.f40618d;
        }

        @Override // io.ktor.utils.io.internal.e
        public final ByteBuffer b() {
            return this.f40617c;
        }

        @Override // io.ktor.utils.io.internal.e
        public final e c() {
            return this.f40620f;
        }

        @Override // io.ktor.utils.io.internal.e
        public final e d() {
            return this.f40621g;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: compiled from: ReadWriteBufferState.kt */
    public static final class d extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f40623c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c initial) {
            super(initial.f40613a, initial.f40614b);
            i.e(initial, "initial");
            this.f40623c = initial;
        }

        @Override // io.ktor.utils.io.internal.e
        public final ByteBuffer a() {
            return this.f40623c.f40618d;
        }

        @Override // io.ktor.utils.io.internal.e
        public final e d() {
            return this.f40623c.f40622h;
        }

        @Override // io.ktor.utils.io.internal.e
        public final e e() {
            return this.f40623c.f40619e;
        }

        public final String toString() {
            return "Reading";
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ReadWriteBufferState.kt */
    public static final class C0459e extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f40624c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0459e(c initial) {
            super(initial.f40613a, initial.f40614b);
            i.e(initial, "initial");
            this.f40624c = initial;
        }

        @Override // io.ktor.utils.io.internal.e
        public final ByteBuffer a() {
            return this.f40624c.f40618d;
        }

        @Override // io.ktor.utils.io.internal.e
        public final ByteBuffer b() {
            return this.f40624c.f40617c;
        }

        @Override // io.ktor.utils.io.internal.e
        public final e e() {
            return this.f40624c.f40621g;
        }

        @Override // io.ktor.utils.io.internal.e
        public final e f() {
            return this.f40624c.f40620f;
        }

        public final String toString() {
            return "Reading+Writing";
        }
    }

    /* JADX INFO: compiled from: ReadWriteBufferState.kt */
    public static final class f extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f40625c = new f(io.ktor.utils.io.internal.f.f40627a, io.ktor.utils.io.internal.f.f40628b);

        public final String toString() {
            return "Terminated";
        }
    }

    /* JADX INFO: compiled from: ReadWriteBufferState.kt */
    public static final class g extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f40626c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c initial) {
            super(initial.f40613a, initial.f40614b);
            i.e(initial, "initial");
            this.f40626c = initial;
        }

        @Override // io.ktor.utils.io.internal.e
        public final ByteBuffer b() {
            return this.f40626c.f40617c;
        }

        @Override // io.ktor.utils.io.internal.e
        public final e c() {
            return this.f40626c.f40622h;
        }

        @Override // io.ktor.utils.io.internal.e
        public final e f() {
            return this.f40626c.f40619e;
        }

        public final String toString() {
            return "Writing";
        }
    }

    public e(ByteBuffer byteBuffer, io.ktor.utils.io.internal.g gVar) {
        this.f40613a = byteBuffer;
        this.f40614b = gVar;
    }

    public ByteBuffer a() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    public ByteBuffer b() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    public e c() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    public e d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    public e e() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    public e f() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }
}
