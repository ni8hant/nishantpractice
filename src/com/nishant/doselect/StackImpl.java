package com.nishant.doselect;

interface IStack {

	void push(Object object);

	Object pop();

}

class StackImpl implements IStack {

	protected Object[] stackArray;

	protected int tos;

	public StackImpl(int capacity) {
		this.stackArray = new Object[capacity];
		this.tos = -1;
	}

	@Override
	public void push(Object object) {
		tos = tos + 1;
		stackArray[tos] = object;
	}

	@Override
	public Object pop() {
		Object object = stackArray[tos];
		stackArray[tos] = null;
		tos--;
		return object;

	}

	public Object peek() {
		return stackArray[tos];
	}
}

interface ISafeStack extends IStack {

	boolean isEmpty();

	boolean isFull();
}


class SafeStackImpl extends StackImpl implements ISafeStack {

	public SafeStackImpl(int capacity) {
		super(capacity);
	}

	@Override
	public boolean isEmpty() {

		if (tos < 0) {
			return true;
		}

		return false;
	}

	@Override
	public boolean isFull() {

		if (tos >= stackArray.length) {
			return true;
		}

		return false;
	}

}