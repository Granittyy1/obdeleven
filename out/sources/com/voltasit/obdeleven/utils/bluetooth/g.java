package com.voltasit.obdeleven.utils.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: compiled from: ClassicBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
public class g implements p109i8.a {
    public static final UUID j = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothAdapter f34337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f34338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f34339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f34341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J8.a f34342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J8.c f34343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final J8.p f34344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34345i;

    /* JADX INFO: compiled from: ClassicBluetoothDevice.kt */
    public final class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BluetoothDevice f34346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public BluetoothSocket f34347c;

        public a(BluetoothDevice bluetoothDevice) {
            this.f34346b = bluetoothDevice;
        }

        public final void a() {
            g gVar = g.this;
            gVar.f34344h.f("ClassicBluetoothDevice", "cancel()");
            try {
                BluetoothSocket bluetoothSocket = this.f34347c;
                if (bluetoothSocket != null) {
                    bluetoothSocket.close();
                }
            } catch (Exception e10) {
                gVar.f34344h.b("ClassicBluetoothDevice", "Can't close socket: " + e10.getMessage());
            }
            this.f34347c = null;
        }

        public final void b() throws Throwable {
            C8.a c0024a;
            C8.a bVar;
            g gVar = g.this;
            J8.p pVar = gVar.f34344h;
            StringBuilder sb2 = new StringBuilder("connectUsingInsecureSocket(device=");
            BluetoothDevice bluetoothDevice = this.f34346b;
            sb2.append(bluetoothDevice);
            sb2.append(")");
            pVar.f("ClassicBluetoothDevice", sb2.toString());
            try {
                BluetoothSocket bluetoothSocketCreateInsecureRfcommSocketToServiceRecord = bluetoothDevice.createInsecureRfcommSocketToServiceRecord(g.j);
                this.f34347c = bluetoothSocketCreateInsecureRfcommSocketToServiceRecord;
                if (bluetoothSocketCreateInsecureRfcommSocketToServiceRecord != null) {
                    try {
                        bluetoothSocketCreateInsecureRfcommSocketToServiceRecord.connect();
                    } catch (Throwable th) {
                        pVar.b("ClassicBluetoothDevice", "Connect using insecure socket failed");
                        pVar.d(th, false);
                        a();
                        c0024a = new C8.a.C0024a(th);
                        bVar = c0024a;
                    }
                }
                pVar.e("ClassicBluetoothDevice", "Connect using insecure socket succeeded");
                bVar = new C8.a.b(p293xa.r.f47939a);
            } catch (IOException e10) {
                pVar.b("ClassicBluetoothDevice", "Cannot create insecure socket: " + e10.getMessage());
                c0024a = new C8.a.C0024a(e10);
            }
            if (bVar instanceof C8.a.b) {
                return;
            }
            if (!(bVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            J8.p pVar2 = gVar.f34344h;
            pVar2.f("ClassicBluetoothDevice", "connectUsingInsecureReflectedSocket(device=" + bluetoothDevice + ")");
            try {
                Class<?> cls = bluetoothDevice.getClass();
                Class TYPE = Integer.TYPE;
                kotlin.jvm.internal.i.d(TYPE, "TYPE");
                Method method = cls.getMethod("createRfcommSocket", (Class[]) Arrays.copyOf(new Class[]{TYPE}, 1));
                kotlin.jvm.internal.i.d(method, "getMethod(...)");
                Object objInvoke = method.invoke(bluetoothDevice, new Object[]{1});
                kotlin.jvm.internal.i.c(objInvoke, "null cannot be cast to non-null type android.bluetooth.BluetoothSocket");
                BluetoothSocket bluetoothSocket = (BluetoothSocket) objInvoke;
                this.f34347c = bluetoothSocket;
                bluetoothSocket.connect();
                pVar2.e("ClassicBluetoothDevice", "Connect using insecure reflected socket succeeded");
            } catch (Exception e11) {
                pVar2.b("ClassicBluetoothDevice", "Connect using insecure reflected socket failed: " + e11.getMessage());
                a();
                pVar2.f("ClassicBluetoothDevice", "connectUsingSecureSocket(device=" + bluetoothDevice + ")");
                try {
                    BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = bluetoothDevice.createRfcommSocketToServiceRecord(g.j);
                    this.f34347c = bluetoothSocketCreateRfcommSocketToServiceRecord;
                    if (bluetoothSocketCreateRfcommSocketToServiceRecord != null) {
                        bluetoothSocketCreateRfcommSocketToServiceRecord.connect();
                    }
                    pVar2.e("ClassicBluetoothDevice", "Connect using secure socket succeeded");
                } catch (Exception e12) {
                    pVar2.b("ClassicBluetoothDevice", "Connect using secure socket failed: " + e12.getMessage());
                    a();
                    throw ((C8.a.C0024a) bVar).f2462a;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws Throwable {
            g.this.f34344h.f("ClassicBluetoothDevice", "ConnectThread.run()");
            String name = this.f34346b.getName();
            if (name == null) {
                name = "Unknown";
            }
            String address = this.f34346b.getAddress();
            if (address == null) {
                address = "Unknown";
            }
            setName("ConnectThread ".concat(name));
            g.this.f34337a.cancelDiscovery();
            try {
                b();
            } catch (Exception e10) {
                if (g.this.f34345i) {
                    J8.a aVar = g.this.f34342f;
                    String message = e10.getMessage();
                    if (message == null) {
                        message = "Unknown";
                    }
                    aVar.w(name, address, message, false);
                }
                g.this.f34345i = false;
                if (getState().ordinal() == 5) {
                    g.this.d(false, e10);
                } else {
                    g gVar = g.this;
                    gVar.f34340d = 0;
                    n nVar = gVar.f34341e;
                    if (nVar == null) {
                        kotlin.jvm.internal.i.m("device");
                        throw null;
                    }
                    W7.c.f7066d = null;
                    if (nVar == null) {
                        kotlin.jvm.internal.i.m("device");
                        throw null;
                    }
                    gVar.f34343g.g(3, nVar, e10);
                }
            }
            g gVar2 = g.this;
            if (gVar2.f34345i) {
                gVar2.f34342f.w(name, address, "", true);
            }
            g gVar3 = g.this;
            gVar3.f34345i = false;
            synchronized (gVar3) {
                gVar3.f34338b = null;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            BluetoothSocket bluetoothSocket = this.f34347c;
            if (bluetoothSocket != null) {
                g gVar4 = g.this;
                synchronized (gVar4) {
                    try {
                        gVar4.f34344h.f("ClassicBluetoothDevice", "connected(");
                        a aVar2 = gVar4.f34338b;
                        if (aVar2 != null) {
                            aVar2.a();
                            gVar4.f34338b = null;
                        }
                        b bVar = gVar4.f34339c;
                        if (bVar != null) {
                            bVar.a();
                            gVar4.f34339c = null;
                        }
                        b bVar2 = new b(gVar4, bluetoothSocket);
                        gVar4.f34339c = bVar2;
                        bVar2.start();
                        n nVar2 = gVar4.f34341e;
                        if (nVar2 == null) {
                            kotlin.jvm.internal.i.m("device");
                            throw null;
                        }
                        nVar2.m(true);
                        if (gVar4.f34340d != 5) {
                            J8.c cVar = gVar4.f34343g;
                            n nVar3 = gVar4.f34341e;
                            if (nVar3 == null) {
                                kotlin.jvm.internal.i.m("device");
                                throw null;
                            }
                            cVar.g(2, nVar3, null);
                        }
                        gVar4.f34340d = 2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: ClassicBluetoothDevice.kt */
    public final class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BluetoothSocket f34349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InputStream f34350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final OutputStream f34351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f34352e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ g f34353f;

        public b(g gVar, BluetoothSocket socket) {
            InputStream inputStream;
            kotlin.jvm.internal.i.e(socket, "socket");
            this.f34353f = gVar;
            this.f34349b = socket;
            OutputStream outputStream = null;
            try {
                inputStream = socket.getInputStream();
                try {
                    outputStream = socket.getOutputStream();
                } catch (IOException unused) {
                }
            } catch (IOException unused2) {
                inputStream = null;
            }
            this.f34350c = inputStream;
            this.f34351d = outputStream;
        }

        public final void a() {
            this.f34352e = false;
            try {
                InputStream inputStream = this.f34350c;
                kotlin.jvm.internal.i.b(inputStream);
                inputStream.close();
            } catch (IOException unused) {
            }
            try {
                OutputStream outputStream = this.f34351d;
                kotlin.jvm.internal.i.b(outputStream);
                outputStream.close();
            } catch (IOException unused2) {
            }
            try {
                this.f34349b.close();
            } catch (IOException unused3) {
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            g gVar = this.f34353f;
            byte[] bArr = new byte[1024];
            setPriority(10);
            this.f34352e = true;
            while (this.f34352e) {
                try {
                    InputStream inputStream = this.f34350c;
                    kotlin.jvm.internal.i.b(inputStream);
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        continue;
                    } else {
                        n nVar = gVar.f34341e;
                        if (nVar == null) {
                            kotlin.jvm.internal.i.m("device");
                            throw null;
                        }
                        nVar.j(i10, bArr);
                    }
                } catch (IOException e10) {
                    a();
                    gVar.d(true, e10);
                }
            }
        }
    }

    public g() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        kotlin.jvm.internal.i.d(defaultAdapter, "getDefaultAdapter(...)");
        this.f34337a = defaultAdapter;
        this.f34342f = (J8.a) KoinJavaComponent.a(J8.a.class);
        this.f34343g = (J8.c) KoinJavaComponent.a(J8.c.class);
        this.f34344h = (J8.p) KoinJavaComponent.a(J8.p.class);
        this.f34345i = true;
        this.f34340d = 0;
    }

    public synchronized void a(n nVar, Context context) {
        a aVar;
        try {
            kotlin.jvm.internal.i.e(context, "context");
            this.f34344h.f("ClassicBluetoothDevice", "connect(device=" + nVar + ")");
            this.f34341e = nVar;
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(nVar.f34367b);
            int i10 = this.f34340d;
            if ((i10 == 1 || i10 == 5) && (aVar = this.f34338b) != null) {
                aVar.a();
                this.f34338b = null;
            }
            b bVar = this.f34339c;
            if (bVar != null) {
                bVar.a();
                this.f34339c = null;
            }
            kotlin.jvm.internal.i.b(remoteDevice);
            a aVar2 = new a(remoteDevice);
            this.f34338b = aVar2;
            aVar2.start();
            this.f34340d = 1;
            this.f34343g.g(1, nVar, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p109i8.a
    public void b(byte b10) {
        this.f34345i = false;
        synchronized (this) {
            if (this.f34340d != 2) {
                return;
            }
            b bVar = this.f34339c;
            p293xa.r rVar = p293xa.r.f47939a;
            kotlin.jvm.internal.i.b(bVar);
            try {
                OutputStream outputStream = bVar.f34351d;
                kotlin.jvm.internal.i.b(outputStream);
                outputStream.write(b10);
            } catch (IOException e10) {
                bVar.a();
                bVar.f34353f.d(true, e10);
            }
        }
    }

    public final void d(boolean z10, Exception exc) {
        int i10;
        a aVar;
        this.f34344h.f("ClassicBluetoothDevice", "connectionLost(reconnect=" + z10 + ")");
        if (this.f34340d != 2 || !z10) {
            synchronized (this) {
                i10 = this.f34340d;
            }
            if (i10 != 0) {
                if (i10 != 6) {
                    J8.c cVar = this.f34343g;
                    n nVar = this.f34341e;
                    if (nVar == null) {
                        kotlin.jvm.internal.i.m("device");
                        throw null;
                    }
                    cVar.g(4, nVar, exc);
                }
                this.f34340d = 0;
                if (this.f34341e != null) {
                    W7.c.f7066d = null;
                    return;
                } else {
                    kotlin.jvm.internal.i.m("device");
                    throw null;
                }
            }
            return;
        }
        n nVar2 = this.f34341e;
        if (nVar2 == null) {
            kotlin.jvm.internal.i.m("device");
            throw null;
        }
        synchronized (this) {
            try {
                this.f34344h.f("ClassicBluetoothDevice", "reconnect(device=" + nVar2 + ")");
                this.f34341e = nVar2;
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter.isEnabled()) {
                    BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(nVar2.f34367b);
                    int i11 = this.f34340d;
                    if ((i11 == 1 || i11 == 5) && (aVar = this.f34338b) != null) {
                        aVar.a();
                        this.f34338b = null;
                    }
                    b bVar = this.f34339c;
                    if (bVar != null) {
                        bVar.a();
                        this.f34339c = null;
                    }
                    kotlin.jvm.internal.i.b(remoteDevice);
                    a aVar2 = new a(remoteDevice);
                    this.f34338b = aVar2;
                    aVar2.start();
                    this.f34340d = 5;
                    this.f34343g.g(5, nVar2, null);
                } else {
                    d(false, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p109i8.a
    public synchronized void stop() {
        try {
            this.f34344h.f("ClassicBluetoothDevice", "stop()");
            this.f34340d = 6;
            a aVar = this.f34338b;
            if (aVar != null) {
                aVar.a();
                this.f34338b = null;
            }
            b bVar = this.f34339c;
            if (bVar != null) {
                bVar.a();
                this.f34339c = null;
            }
            n nVar = this.f34341e;
            if (nVar == null) {
                kotlin.jvm.internal.i.m("device");
                throw null;
            }
            W7.c.f7066d = null;
            J8.c cVar = this.f34343g;
            if (nVar == null) {
                kotlin.jvm.internal.i.m("device");
                throw null;
            }
            cVar.g(0, nVar, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p109i8.a
    public void c() {
    }
}
