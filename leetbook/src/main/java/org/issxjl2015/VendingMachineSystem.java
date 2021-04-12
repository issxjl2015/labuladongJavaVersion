package org.issxjl2015;

import java.util.*;

public class VendingMachineSystem {
    public int trayNum;
    public int trayCapacity;
    public TreeMap<Integer, LinkedList<Integer>> machine;
    public VendingMachineSystem(int trayNum, int trayCapacity) {
        this.trayNum = trayNum;
        this.trayCapacity = trayCapacity;
        machine = new TreeMap<>();
    }
    public boolean addProduct(int brandId, int[] productIdList) {
        if (machine.containsKey(brandId)) {
            LinkedList<Integer> list = machine.get(brandId);
            if (list.size() + productIdList.length < trayCapacity) {
                // 说明可以正常加入
                LinkedList<Integer> listTmp = tranferLinkedList(productIdList);
                list.addAll(listTmp);
                return true;
            } else {
                return false;
            }
        } else {
            if (machine.size() < trayNum) {
                // 存在新的轨道
                LinkedList<Integer> list = tranferLinkedList(productIdList);
                machine.put(brandId, list);
                return true;
            } else {
                return false;
            }
        }
    }
    public int[] buyProduct(int brandId, int num) {
        if (machine.containsKey(brandId)) {
            LinkedList<Integer> list = machine.get(brandId);
            if (list.size() >= num) {
                int[] ans = getProduct(list, num);
                return ans;
            } else {
                return new int[] {};
            }
        } else {
            return new int[] {};
        }
    }
    public int[] queryProduct() {
        if (machine.isEmpty()) {
            return new int[] {};
        }
        Set<Integer> set = machine.keySet();
        int[] ans = new int[machine.size()];
        int i = 0;
        for (Iterator<Integer> dd = set.iterator(); dd.hasNext();) {
            Integer aa = dd.next();
            ans[i++] = aa;
        }
        return ans;
    }
    /**
     * 根据 int 数组，转换为 LinkedList
     * @param productIdList productIdList
     * @return LinkedList
     */
    public LinkedList<Integer> tranferLinkedList(int[] productIdList) {
        LinkedList<Integer> list = new LinkedList<>();
        Arrays.sort(productIdList);
        for (int product : productIdList) {
            list.add(product);
        }
        return list;
    }
    /**
     * 根据list，获取list中前 num 个元素
     * */
    public int[] getProduct(LinkedList<Integer> list, int num) {
        int[] ans = new int[num];

        int i = 0;
        for (Iterator<Integer> dd = list.iterator(); dd.hasNext();) {
            Integer aa = dd.next();
            ans[i] = aa;
            i++;
            if (i == num) {
                break;
            }
            dd.remove();
        }
        return ans;
    }
}
