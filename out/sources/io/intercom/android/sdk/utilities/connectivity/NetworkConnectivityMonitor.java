package io.intercom.android.sdk.utilities.connectivity;

import android.content.Context;
import android.content.IntentFilter;
import p186p0.a;

/* JADX INFO: loaded from: classes.dex */
public class NetworkConnectivityMonitor implements ConnectivityBroadcastReceiver.ConnectivityUpdateListener {
    private ConnectivityEventListener listener;
    private NetworkState lastState = NetworkState.UNKNOWN;
    private boolean didRegister = false;
    private final ConnectivityBroadcastReceiver receiver = new ConnectivityBroadcastReceiver(this);

    public interface ConnectivityEventListener {
        void onDisconnect();

        void onReconnect();
    }

    public ConnectivityEventListener getListener() {
        return this.listener;
    }

    @Override // io.intercom.android.sdk.utilities.connectivity.ConnectivityBroadcastReceiver.ConnectivityUpdateListener
    public void onUpdate(NetworkState networkState) {
        NetworkState networkState2 = this.lastState;
        if (networkState == networkState2) {
            return;
        }
        ConnectivityEventListener connectivityEventListener = this.listener;
        if (connectivityEventListener != null) {
            NetworkState networkState3 = NetworkState.NOT_CONNECTED;
            if (networkState == networkState3) {
                connectivityEventListener.onDisconnect();
            } else if (networkState == NetworkState.CONNECTED && networkState2 == networkState3) {
                connectivityEventListener.onReconnect();
            }
        }
        this.lastState = networkState;
    }

    public void setListener(ConnectivityEventListener connectivityEventListener) {
        this.listener = connectivityEventListener;
    }

    public synchronized void startListening(Context context) {
        if (!this.didRegister) {
            a.c(context, this.receiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 4);
            this.didRegister = true;
        }
    }

    public synchronized void stopListening(Context context) {
        if (this.didRegister) {
            context.unregisterReceiver(this.receiver);
            this.didRegister = false;
        }
    }
}
