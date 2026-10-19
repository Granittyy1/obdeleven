package io.grpc.internal;

import io.grpc.Status;

/* JADX INFO: loaded from: classes3.dex */
public interface ClientStreamListener extends Q0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RpcProgress {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RpcProgress f37134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RpcProgress f37135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final RpcProgress f37136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final RpcProgress f37137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ RpcProgress[] f37138f;

        static {
            RpcProgress rpcProgress = new RpcProgress("PROCESSED", 0);
            f37134b = rpcProgress;
            RpcProgress rpcProgress2 = new RpcProgress("REFUSED", 1);
            f37135c = rpcProgress2;
            RpcProgress rpcProgress3 = new RpcProgress("DROPPED", 2);
            f37136d = rpcProgress3;
            RpcProgress rpcProgress4 = new RpcProgress("MISCARRIED", 3);
            f37137e = rpcProgress4;
            f37138f = new RpcProgress[]{rpcProgress, rpcProgress2, rpcProgress3, rpcProgress4};
        }

        public RpcProgress() {
            throw null;
        }

        public static RpcProgress valueOf(String str) {
            return (RpcProgress) Enum.valueOf(RpcProgress.class, str);
        }

        public static RpcProgress[] values() {
            return (RpcProgress[]) f37138f.clone();
        }
    }

    void b(io.grpc.m mVar);

    void d(Status status, RpcProgress rpcProgress, io.grpc.m mVar);
}
