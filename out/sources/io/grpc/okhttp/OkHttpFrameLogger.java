package io.grpc.okhttp;

import A8.p;
import io.grpc.okhttp.internal.framed.ErrorCode;
import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import p237t3.x;
import p318zb.C2839f;

/* JADX INFO: loaded from: classes3.dex */
public final class OkHttpFrameLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f37832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Level f37833b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Direction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Direction f37834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Direction f37835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Direction[] f37836d;

        static {
            Direction direction = new Direction("INBOUND", 0);
            f37834b = direction;
            Direction direction2 = new Direction("OUTBOUND", 1);
            f37835c = direction2;
            f37836d = new Direction[]{direction, direction2};
        }

        public Direction() {
            throw null;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f37836d.clone();
        }
    }

    public enum SettingParams {
        /* JADX INFO: Fake field, exist only in values array */
        HEADER_TABLE_SIZE(1),
        /* JADX INFO: Fake field, exist only in values array */
        ENABLE_PUSH(2),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_CONCURRENT_STREAMS(4),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_FRAME_SIZE(5),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_HEADER_LIST_SIZE(6),
        /* JADX INFO: Fake field, exist only in values array */
        INITIAL_WINDOW_SIZE(7);

        private final int bit;

        SettingParams(int i10) {
            this.bit = i10;
        }

        public final int a() {
            return this.bit;
        }
    }

    public OkHttpFrameLogger(Level level) {
        Logger logger = Logger.getLogger(d.class.getName());
        p.j(level, "level");
        this.f37833b = level;
        p.j(logger, "logger");
        this.f37832a = logger;
    }

    public static String h(C2839f c2839f) {
        long j = c2839f.f49074c;
        if (j <= 64) {
            return c2839f.y0().f();
        }
        return c2839f.A0((int) Math.min(j, 64L)).f() + "...";
    }

    public final boolean a() {
        return this.f37832a.isLoggable(this.f37833b);
    }

    public final void b(Direction direction, int i10, C2839f c2839f, int i11, boolean z10) {
        if (a()) {
            this.f37832a.log(this.f37833b, direction + " DATA: streamId=" + i10 + " endStream=" + z10 + " length=" + i11 + " bytes=" + h(c2839f));
        }
    }

    public final void c(Direction direction, int i10, ErrorCode errorCode, ByteString byteString) {
        if (a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(direction);
            sb2.append(" GO_AWAY: lastStreamId=");
            sb2.append(i10);
            sb2.append(" errorCode=");
            sb2.append(errorCode);
            sb2.append(" length=");
            sb2.append(byteString.e());
            sb2.append(" bytes=");
            C2839f c2839f = new C2839f();
            c2839f.K0(byteString);
            sb2.append(h(c2839f));
            this.f37832a.log(this.f37833b, sb2.toString());
        }
    }

    public final void d(Direction direction, long j) {
        if (a()) {
            this.f37832a.log(this.f37833b, direction + " PING: ack=false bytes=" + j);
        }
    }

    public final void e(Direction direction, int i10, ErrorCode errorCode) {
        if (a()) {
            this.f37832a.log(this.f37833b, direction + " RST_STREAM: streamId=" + i10 + " errorCode=" + errorCode);
        }
    }

    public final void f(Direction direction, x xVar) {
        if (a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(direction);
            sb2.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(SettingParams.class);
            for (SettingParams settingParams : SettingParams.values()) {
                if (xVar.a(settingParams.a())) {
                    enumMap.put(settingParams, Integer.valueOf(((int[]) xVar.f47256b)[settingParams.a()]));
                }
            }
            sb2.append(enumMap.toString());
            this.f37832a.log(this.f37833b, sb2.toString());
        }
    }

    public final void g(Direction direction, int i10, long j) {
        if (a()) {
            this.f37832a.log(this.f37833b, direction + " WINDOW_UPDATE: streamId=" + i10 + " windowSizeIncrement=" + j);
        }
    }
}
