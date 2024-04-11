package com.example.myapp;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.kingsense.sdk.BleListener;
import com.kingsense.sdk.eegsdk;

import org.json.JSONObject;

@CapacitorPlugin(name = "EEGSignal")
public class EEGPlugin extends Plugin{
    private com.kingsense.sdk.eegsdk eegsdk;
    private final BleListener bleListener = new BleListener(){
        @Override
        public void onDeviceFound(BluetoothDevice bluetoothDevice){
            // 搜索到设备回调
        }

        @Override
        public void onDiscoveryOutTime(){
            // 扫描结束回调
        }

        @Override
        public void onServiceDiscoverySucceed(BluetoothGatt bluetoothGatt, int i){
            // 发现服务成功
        }

        @Override
        public void onConnectFailure(){
            // 连接失败回调
        }

        @Override
        public void onDisConnectSuccess(){
            // 断开连接成功
        }

        @Override
        public void onReceiveData(JSONObject data){
            // 接收到数据后的回调
        }

        @Override
        public void onReceiveMessage(JSONObject data){
            // 收到消息？？？
        }
    };
    // 结束

    public void initBle(){
        // 初始化蓝牙，bleListener回调借口, 参考如下：
//        eegsdk=new eegsdk();
//        eegsdk.init(mContext,bleListener);
//        //检查蓝牙是否可用
//        if(!eegsdk.checkBLE()) {
//            Log.d(TAG, "该设备不支持低功耗蓝牙");
//            Toast.makeText(mContext, "该设备不支持低功耗蓝牙", Toast.LENGTH_LONG).show();
//        }else{
//            if(!eegsdk.isEnable()){//蓝牙未打开，去打开蓝牙
//                eegsdk.openBluetooth(false);
//            }
//        }
//        //打开相关权限
//        eegsdk.openPermission();
        // 在onCreate()中进行初始化
    }

}
