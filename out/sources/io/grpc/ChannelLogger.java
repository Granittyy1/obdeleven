package io.grpc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ChannelLogger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ChannelLogLevel {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ChannelLogLevel f36862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ChannelLogLevel f36863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ChannelLogLevel f36864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final ChannelLogLevel f36865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ChannelLogLevel[] f36866f;

        static {
            ChannelLogLevel channelLogLevel = new ChannelLogLevel("DEBUG", 0);
            f36862b = channelLogLevel;
            ChannelLogLevel channelLogLevel2 = new ChannelLogLevel("INFO", 1);
            f36863c = channelLogLevel2;
            ChannelLogLevel channelLogLevel3 = new ChannelLogLevel("WARNING", 2);
            f36864d = channelLogLevel3;
            ChannelLogLevel channelLogLevel4 = new ChannelLogLevel("ERROR", 3);
            f36865e = channelLogLevel4;
            f36866f = new ChannelLogLevel[]{channelLogLevel, channelLogLevel2, channelLogLevel3, channelLogLevel4};
        }

        public ChannelLogLevel() {
            throw null;
        }

        public static ChannelLogLevel valueOf(String str) {
            return (ChannelLogLevel) Enum.valueOf(ChannelLogLevel.class, str);
        }

        public static ChannelLogLevel[] values() {
            return (ChannelLogLevel[]) f36866f.clone();
        }
    }

    public abstract void a(ChannelLogLevel channelLogLevel, String str);

    public abstract void b(ChannelLogLevel channelLogLevel, String str, Object... objArr);
}
