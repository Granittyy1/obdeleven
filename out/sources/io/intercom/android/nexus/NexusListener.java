package io.intercom.android.nexus;

/* JADX INFO: loaded from: classes3.dex */
public interface NexusListener {
    void notifyEvent(NexusEvent nexusEvent);

    void onConnect();

    void onConnectFailed();

    void onShutdown();
}
