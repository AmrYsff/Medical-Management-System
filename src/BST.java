package project;

class BSTNode {
	Employee data;
	BSTNode left, right;

	public BSTNode(Employee data) {
		this.data = data;
		this.left = this.right = null;
	}
}

class EmployeeBST {
	private BSTNode root;

	public void addEmployee(Employee employee) {
		root = addRecursively(root, employee);
	}

	private BSTNode addRecursively(BSTNode node, Employee employee) {
		if (node == null) {
			return new BSTNode(employee);
		}
		if (employee.employeeID < node.data.employeeID) {
			node.left = addRecursively(node.left, employee);
		} else if (employee.employeeID > node.data.employeeID) {
			node.right = addRecursively(node.right, employee);
		}
		return node;
	}

	public void inOrderTraversal() {
		inOrderTraversal(root);
	}

	private void inOrderTraversal(BSTNode node) {
		if (node != null) {
			inOrderTraversal(node.left);
			System.out.println(node.data.toString());
			inOrderTraversal(node.right);
		}
	}
	
	public String findEmployee(int employeeID) {
        return findEmployeeRecursively(root, employeeID);
    }

    private String findEmployeeRecursively(BSTNode node, int employeeID) {
        if (node == null) {
            return "Employee not found";
        }
        if (employeeID == node.data.employeeID) {
            return node.data.name;
        }
        if (employeeID < node.data.employeeID) {
            return findEmployeeRecursively(node.left, employeeID);
        }
        return findEmployeeRecursively(node.right, employeeID);
    }
	
    
	
}
