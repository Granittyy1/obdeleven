package io.intercom.android.sdk.models;

import I7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ActiveBot.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class StreamingPart {
    public static final int $stable = 8;

    @b("metadata")
    private final Metadata metadata;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamingPart() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StreamingPart copy$default(StreamingPart streamingPart, Metadata metadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            metadata = streamingPart.metadata;
        }
        return streamingPart.copy(metadata);
    }

    public final Metadata component1() {
        return this.metadata;
    }

    public final StreamingPart copy(Metadata metadata) {
        return new StreamingPart(metadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreamingPart) && i.a(this.metadata, ((StreamingPart) obj).metadata);
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        Metadata metadata = this.metadata;
        if (metadata == null) {
            return 0;
        }
        return metadata.hashCode();
    }

    public String toString() {
        return "StreamingPart(metadata=" + this.metadata + ')';
    }

    public StreamingPart(Metadata metadata) {
        this.metadata = metadata;
    }

    public /* synthetic */ StreamingPart(Metadata metadata, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : metadata);
    }
}
